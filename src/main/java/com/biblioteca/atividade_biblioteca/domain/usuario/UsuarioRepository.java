package com.biblioteca.atividade_biblioteca.domain.usuario;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{

    
}
