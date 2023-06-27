package pe.edu.upc.fastfit.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.fastfit.dtos.RoleDTO;
import pe.edu.upc.fastfit.dtos.UserDTO;
import pe.edu.upc.fastfit.entities.Role;
import pe.edu.upc.fastfit.entities.Users;
import pe.edu.upc.fastfit.services.IRoleService;
import pe.edu.upc.fastfit.services.IUserService;

import java.util.List;
import java.util.stream.Collectors;


@Controller
//@SessionAttributes
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private IUserService uService;
	@Autowired
	private IRoleService rService;

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public void insert(@RequestBody RoleDTO dto) {
		ModelMapper m = new ModelMapper();
		Role r = m.map(dto, Role.class);
		rService.insert(r);
	}


	@GetMapping
	@PreAuthorize("hasAnyAuthority('ADMIN', 'PSICO','USER')")
	public List<RoleDTO> list() {
		return uService.list().stream().map(x -> {
			ModelMapper m = new ModelMapper();
			return m.map(x, RoleDTO.class);
		}).collect(Collectors.toList());
	}



	@GetMapping("/new")
	public String newRole(Model model) {
		model.addAttribute("role", new Role());
		model.addAttribute("listaUsuarios", uService.list());
		return "role/role";
	}

	@PostMapping("/save")
	public String saveRole(@Validated Role role, BindingResult result, Model model, SessionStatus status) throws Exception {
		if (result.hasErrors()) {
			return "role/role";
		} else {
			rService.insert(role);
			model.addAttribute("mensaje", "Se guardó correctamente");
			status.setComplete();
		}
		model.addAttribute("listaRoles", rService.list());

		return "role/role";

	}

	@GetMapping("/list")
	public String listRole(Model model) {
		try {
			model.addAttribute("role", new Role());
			model.addAttribute("listaRoles", rService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "role/listRole";
	}

}
