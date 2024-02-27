package com.example.Tarea3_Backend.DTOs;

import com.example.Tarea3_Backend.model.Cliente;
import com.example.Tarea3_Backend.model.Factura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteFacturasDTO {

    private String cliente;

    private List<FacturaDTO> lista_Facturas;

}
