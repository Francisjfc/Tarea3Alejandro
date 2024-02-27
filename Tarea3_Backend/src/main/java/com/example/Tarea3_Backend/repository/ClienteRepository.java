package com.example.Tarea3_Backend.repository;

import com.example.Tarea3_Backend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    Cliente findByNombre(String nombre);
}
