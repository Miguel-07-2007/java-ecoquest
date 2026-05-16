package com.miguelmontoya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RutaTuristica {

    //Atributos: 
    //Info general de la lista
    private String nombre;
    private String descripcion;
    private String region; //región a la que partenece la ruta
    private List<PuntoInteres> puntos; //Puntos de interes de la ruta
    private Set<String> etiquetas; // Etiquetas "asociadas" a la ruta

    //Constructor (inicializa la lista de puntos y el set de etiquetas)
    public RutaTuristica(String nombre, String descripcion, String region) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.region = region;
        this.puntos = new ArrayList<>(); //List: Eficiente, elementos del mismo tipo
        this.etiquetas = new HashSet<>(); //HashSet evita duplicados y agiliza
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRegion() {
        return region;
    }

    public List<PuntoInteres> getPuntos() {
        return puntos;
    }

    public Set<String> getEtiquetas() {
        return etiquetas;
    }

    public void agregarPunto(PuntoInteres punto){
        this.puntos.add(punto); //Add, método de la clase List, permite agregar un elemento
    }
    
    public void agregarEtiqueta(String etiqueta){
        etiquetas.add(etiqueta.toLowerCase()); //Agregar etiqueta en minus
    }

    @Override
    public String toString() {
        return "RutaTuristica [nombre=" + nombre + ", descripcion=" + descripcion + ", region=" + region + ", puntos="
                + puntos + ", etiquetas=" + etiquetas + "]";
    }

    

}
