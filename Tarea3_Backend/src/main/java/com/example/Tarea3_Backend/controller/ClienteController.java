package com.example.Tarea3_Backend.controller;

import com.example.Tarea3_Backend.DTOs.ClienteFacturasDTO;
import com.example.Tarea3_Backend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin({"*"})
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{nombre}")
    public ClienteFacturasDTO clientePorNombre(@PathVariable String nombre){
        return clienteService.clienteFacturas(nombre);
    }
}
