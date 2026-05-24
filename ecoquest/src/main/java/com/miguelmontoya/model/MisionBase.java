package com.miguelmontoya.model;

import java.time.LocalDate;
import java.util.Set;

import com.miguelmontoya.enums.EstadoMision;

public abstract class MisionBase implements Mision{
    // ID, descripción, ubicación, fecha, nivel de dificultad
    private String id;
    private String descripcion;
    private String ubicacion;
    private LocalDate fecha;
    private String nivelDificultad;
    private EstadoMision estado;
    private Set<Voluntario> voluntarios;

    public MisionBase(String id, String descripcion, String ubicacion, LocalDate fecha, String nivelDificultad) {
        this.id = id;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.nivelDificultad = nivelDificultad;
        this.estado = EstadoMision.INCOMPLETA;
        this.voluntarios =  voluntarios;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String getNivelDificultad() {
        return nivelDificultad;
    }

    @Override
    public EstadoMision getEstado() {
        return estado;
    }

    @Override
    public void setEstado(EstadoMision estado) {
        this.estado = estado;
    }
    
    @Override
    public boolean completarMision() {
        if (estado.equals(EstadoMision.INCOMPLETA)) {
            estado = EstadoMision.COMPLETADA;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Mision [id=" + id + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", fecha=" + fecha
                + ", nivelDificultad=" + nivelDificultad + ", estado= " + estado + "]";
    }

}
