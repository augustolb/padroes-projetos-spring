package com.example.lab_padroes_projetos_spring.repository;

import com.example.lab_padroes_projetos_spring.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository <Cliente, Long> {
}
