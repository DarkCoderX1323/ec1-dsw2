package com.example.ec1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcursos;
    private String nombreCurso;
    private int cicloCurso;
    private String modalidadCurso;
    private int nroMeses;
    private String nombreSede;
    public int getIdcursos() {
        return idcursos;
    }
    public void setIdcursos(int idcursos) {
        this.idcursos = idcursos;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public int getCicloCurso() {
        return cicloCurso;
    }
    public void setCicloCurso(int cicloCurso) {
        this.cicloCurso = cicloCurso;
    }
    public String getModalidadCurso() {
        return modalidadCurso;
    }
    public void setModalidadCurso(String modalidadCurso) {
        this.modalidadCurso = modalidadCurso;
    }
    public int getNroMeses() {
        return nroMeses;
    }
    public void setNroMeses(int nroMeses) {
        this.nroMeses = nroMeses;
    }
    public String getNombreSede() {
        return nombreSede;
    }
    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    
}
