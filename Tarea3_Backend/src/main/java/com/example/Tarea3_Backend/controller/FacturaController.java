package com.example.Tarea3_Backend.controller;

import com.example.Tarea3_Backend.model.Factura;
import com.example.Tarea3_Backend.service.FacturaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin({"*"})
public class FacturaController {

    private FacturaService facturaService;

    @PostMapping("/guardarFactura")
    public Factura guardarFacturas(Factura factura){
        return facturaService.guardarFactura(factura);
    }
}
