package com.example.Tarea3_Backend.service;

import com.example.Tarea3_Backend.Converter.ClienteFacturaConverter;
import com.example.Tarea3_Backend.DTOs.ClienteFacturasDTO;
import com.example.Tarea3_Backend.model.Cliente;
import com.example.Tarea3_Backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteFacturaConverter clienteFacturaConverter;

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public ClienteFacturasDTO clienteFacturas(String nombre){
        Cliente cliente = clienteRepository.findByNombre(nombre);
        return clienteFacturaConverter.convertEntityToDTO(cliente);
    }
}
