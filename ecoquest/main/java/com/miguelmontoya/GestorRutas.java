package com.miguelmontoya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorRutas {

    private List<RutaTuristica> rutas;
    private Map<String, List<RutaTuristica>> rutasPorRegion;

    /*
     * constructor del gestor, se hace la inicialización de la list
     * y el map como buena práctica.
     * 
     * crea el arraylist rutas para almacenar las rutas de manera
     * general, y el hashmap rutasPorRegion (clave: región,
     * valor: lista de rutas)
     */
    public GestorRutas() {
        rutas = new ArrayList<>();
        rutasPorRegion = new HashMap<>();
    }

    public void agregarRuta(RutaTuristica ruta) {
        rutas.add(ruta);

        // Registrar en el mapa por región
        String region = ruta.getRegion();
        /*
         * Revisa si la llave existe, en caso afirmativo, ignora, en
         * caso negativo lo agrega al map y le asigna el valor
         * (la lista de rutas para esa región).
         * 
         * llama a la lista de rutas según la región pasada y le
         * agrega la ruta
         */
        rutasPorRegion.putIfAbsent(region, new ArrayList<>());
        rutasPorRegion.get(region).add(ruta);
    }

    public List<RutaTuristica> buscarPorRegion(String region){
        return rutasPorRegion.get(region);
    }

    public List<RutaTuristica> recomendarRutas(Usuario usuario){
        List<RutaTuristica> recomendadas = new ArrayList<>();

        for(RutaTuristica ruta: rutas){
            for(String etiqueta: ruta.getEtiquetas()){
                if (usuario.tieneInteres(etiqueta)){
                    recomendadas.add(ruta);
                    break;
                }
            }
        }
        return recomendadas;
    }
}
