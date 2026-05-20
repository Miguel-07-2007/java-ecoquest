package com.miguelmontoya.model;

import java.time.LocalDate;

import com.miguelmontoya.enums.EstadoMision;

public interface Mision {

        String getId();

    String getDescripcion();

    String getUbicacion();

    LocalDate getFecha();

    String getNivelDificultad();

    EstadoMision getEstado();

    void setEstado(EstadoMision estado);

    boolean completarMision();


    

    
}
