package com.miguelmontoya;

import java.util.Set;

public class Usuario {

    //Atributos
    private String nombre;
    private Set<String> intereses; //intereses del usuario, debe 


    public Usuario(String nombre) {
        this.nombre = nombre;
        this.intereses = new java.util.HashSet<>();
    }


    public String getNombre() {
        return nombre;
    }

    public Set<String> getIntereses() {
        return intereses;
    }
    
    public void agregarIntereses(String interes){
        if(interes != null && !interes.trim().isEmpty()){
            intereses.add(interes.toLowerCase());
        }
    }

    public boolean tieneInteres(String interes){
         return intereses.contains(interes.toLowerCase());
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", intereses=" + intereses + "]";
    }

    
}
