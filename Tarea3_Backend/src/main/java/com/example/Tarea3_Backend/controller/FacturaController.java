package com.example.Tarea3_Backend.controller;

import com.example.Tarea3_Backend.model.Factura;
import com.example.Tarea3_Backend.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin({"*"})
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @PostMapping("/guardarFactura")
    public Factura guardarFacturas(@RequestBody Factura factura){
        return facturaService.guardarFactura(factura);
    }
}
