package com.example.Tarea3_Backend.Converter;

import com.example.Tarea3_Backend.DTOs.ClienteFacturasDTO;
import com.example.Tarea3_Backend.DTOs.FacturaDTO;
import com.example.Tarea3_Backend.model.Cliente;
import com.example.Tarea3_Backend.model.Factura;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteFacturaConverter {

    public ClienteFacturasDTO convertEntityToDTO(Cliente cliente){
        ClienteFacturasDTO clienteFacturasDTO = new ClienteFacturasDTO();

        clienteFacturasDTO.setCliente(cliente.getNombre());

        List<Factura> facturas = cliente.getFacturas();

        List<FacturaDTO> facturaDTOList = new ArrayList<>();

        facturas.forEach(factura -> {
            FacturaDTO facturaDTO = new FacturaDTO();

            facturaDTO.setId(factura.getId());
            facturaDTO.setImporteTotal(factura.getImporteTotal());

            facturaDTOList.add(facturaDTO);
        });

        clienteFacturasDTO.setFacturaDTOList(facturaDTOList);

        return clienteFacturasDTO;
    }
}
