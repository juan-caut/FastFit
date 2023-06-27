package pe.edu.upc.fastfit.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.fastfit.dtos.ClientDTO;
import pe.edu.upc.fastfit.dtos.UserDTO;
import pe.edu.upc.fastfit.entities.Client;
import pe.edu.upc.fastfit.entities.Users;
import pe.edu.upc.fastfit.services.IUserService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


//@Secured({"ROLE_ADMIN"})
@Controller
@RequestMapping("/users")
public class 	UserController {
	@Autowired
	private PasswordEncoder bcrypt;
	@Autowired
	private IUserService uService;

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
	public void insert(@RequestBody UserDTO dto) {
		ModelMapper m = new ModelMapper();
		Users u = m.map(dto, Users.class);
		uService.insert(u);
	}


	@GetMapping
	@PreAuthorize("hasAnyAuthority('ADMIN', 'PSICO','USER')")
	public List<UserDTO> list() {
		return uService.list().stream().map(x -> {
			ModelMapper m = new ModelMapper();
			return m.map(x, UserDTO.class);
		}).collect(Collectors.toList());
	}





	@PostMapping("/save")
	public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status)
			throws Exception {
		if (result.hasErrors()) {
			return "usersecurity/user";
		} else {
			String bcryptPassword = bcrypt.encode(user.getPassword());
			user.setPassword(bcryptPassword);
			int rpta = uService.insert(user);
			if (rpta > 0) {
				model.addAttribute("mensaje", "Ya existe");
				return "usersecurity/user";
			} else {
				model.addAttribute("mensaje", "Se guardó correctamente");
				status.setComplete();
			}
		}
		model.addAttribute("listaUsuarios", uService.list());

		return "usersecurity/listUser";
	}

	@GetMapping("/list")
	public String listUser(Model model) {
		try {
			model.addAttribute("user", new Users());
			model.addAttribute("listaUsuarios", uService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "usersecurity/listUser";
	}

}
