package com.biblioteca.atividade_biblioteca.domain.livro;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, UUID>{

    
}