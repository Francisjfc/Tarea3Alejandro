package com.example.Tarea3_Backend.service;

import com.example.Tarea3_Backend.DTOs.ClienteFacturasDTO;
import com.example.Tarea3_Backend.model.Cliente;
import com.example.Tarea3_Backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public ClienteFacturasDTO clienteFacturas(String nombre){
        return clienteRepository.findByNombre(nombre);
    }
}
