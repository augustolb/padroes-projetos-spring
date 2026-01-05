package com.example.lab_padroes_projetos_spring.repository;

import com.example.lab_padroes_projetos_spring.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
