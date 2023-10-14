package com.example.ec1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ec1.model.Curso;
import com.example.ec1.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping("/")
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping("/")
    public Curso agregarCurso(@RequestBody Curso curso) {
        return cursoService.agregarCurso(curso);
    }
}

