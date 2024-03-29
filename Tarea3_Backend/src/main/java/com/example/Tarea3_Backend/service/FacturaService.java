package com.example.Tarea3_Backend.service;

import com.example.Tarea3_Backend.model.Factura;
import com.example.Tarea3_Backend.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura guardarFactura(Factura factura){
        return facturaRepository.save(factura);
    }
}
