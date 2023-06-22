package pe.edu.upc.fastfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.fastfit.dtos.ReportePagosDTO;
import pe.edu.upc.fastfit.services.IPaymentService;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    private IPaymentService ps;

    @GetMapping("/reporte1")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ReportePagosDTO getReporte1() {
        ReportePagosDTO reporte1 = ps.reporte1();
        return reporte1;
    }

}
