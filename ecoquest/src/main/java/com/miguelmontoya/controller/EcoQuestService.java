package com.miguelmontoya.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.miguelmontoya.model.Mision;
import com.miguelmontoya.model.Voluntario;
import com.miguelmontoya.service.GestorMisiones;
import com.miguelmontoya.view.ConsolaView;

public class EcoQuestService {
    
    private Map<String, Voluntario> voluntarios;
    private Map<String, Mision> misiones;
    private GestorMisiones gestorMisiones;
    private Set<String> puntosEco;
    private Set<String> misionesCompletadas;
    private ConsolaView consola;

    /**
     * los motivos de selección de las estructuras de datos son los siguientes:
     * - HashMap permite el acceso rápido a valores a través de su clave, sin requerir un orden en la estructura
     * - HashSet permite acceder a pares clave valor evitando valores repetidos, muy conveniente para el caso 
     *   de los puntos ecológicos y las misiones completadas
     * - Las otras estructuras de datos, empleadas para las misiones están actualmente ubicadas en el gestor misiones
     */
    public EcoQuestService() {
        this.voluntarios = new HashMap<>();
        this.misiones = new HashMap<>();
        this.gestorMisiones = new GestorMisiones(new LinkedHashMap<>());
        this.puntosEco = new HashSet<>();
        this.misionesCompletadas = new HashSet<>();
        this.consola = new ConsolaView(new Scanner(System.in));
    }

    
    public void registrarVoluntario(Scanner Scanner) {
        System.out.println("ID:");
        String id = Scanner.nextLine();
        if(voluntarios.containsKey(id)) {
            consola.mostrarMensaje("El ID ya está registrado.");
            return;
        }
        consola.mostrarMensaje("Nombre:");
        String nombre = Scanner.nextLine();
        
        consola.mostrarMensaje("Habilidades (separadas por comas):");
        List<String> habilidades = Arrays.stream(Scanner.nextLine().split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        Voluntario voluntario = new Voluntario(id, nombre, habilidades);
        voluntarios.put(id, voluntario);

    }

    public void registrarMision(Mision mision) {
       
    }

    public void registrarPuntoEco(String puntoEco) {
        
    }

    public void completarMision(Scanner Scanner){

    }
    
    

}
