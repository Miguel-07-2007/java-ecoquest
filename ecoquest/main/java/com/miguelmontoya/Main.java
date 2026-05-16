package com.miguelmontoya;

public class Main {
    public static void main(String[] args) {
        
        RutaTuristica ruta = new RutaTuristica("Ruta del Café", "Una ruta que recorre las mejores fincas cafeteras de la región.", "Eje Cafetero");
        
        ruta.agregarEtiqueta("Café");
        ruta.agregarEtiqueta("Naturaleza");
        ruta.agregarEtiqueta("cultura");

        ruta.agregarPunto(new PuntoInteres("Finca La Esperanza", "Una finca tradicional con tours de café y degustaciones.", "4.12345, -75.12345"));
        System.out.println(ruta);
    }
}