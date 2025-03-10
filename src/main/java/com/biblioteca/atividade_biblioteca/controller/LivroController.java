package com.biblioteca.atividade_biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.atividade_biblioteca.domain.livro.LivroRepository;

@RestController
@RequestMapping("/livros")

public class LivroController {
    @Autowired
    private LivroRepository livroRepository;
    
}
