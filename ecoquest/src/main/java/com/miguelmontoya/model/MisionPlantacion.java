package com.miguelmontoya.model;

import java.time.LocalDate;

public class MisionPlantacion extends MisionBase implements Mision{
   
    public MisionPlantacion(String id, String descripcion, String ubicacion,
                 LocalDate fecha, String nivelDificultad) {
        super(id, descripcion, ubicacion, fecha, nivelDificultad);
    }
}
