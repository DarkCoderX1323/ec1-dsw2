package com.example.ec1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ec1.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}

