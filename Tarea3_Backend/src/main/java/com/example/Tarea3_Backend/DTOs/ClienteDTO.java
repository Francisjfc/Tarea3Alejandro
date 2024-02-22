package com.example.Tarea3_Backend.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {

    private Long id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
}
