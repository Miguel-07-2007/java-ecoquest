package com.miguelmontoya.view;

import java.util.Scanner;

public class ConsolaView {

    private Scanner scanner;

    public ConsolaView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void mostrarMenu(){
        System.out.println("====================================");
        System.out.println("---------- MENU DE ECOQUEST --------");
        System.out.println("1. Registrar Voluntario\r\n" + // Se debe agregar a la lista de voluntarios
                        "2. Registrar Misión\r\n" + // Se agrega desde el gestor de misiones
                        "3. Registrar Punto Ecológico\r\n" + // Agregar punto a la lista de puntos ecológicos
                        "4. Asignar Voluntario a Misión\r\n" + // 
                        "5. Completar Misión\r\n" + //
                        "6. Buscar Voluntarios por Habilidad\r\n" + //
                        "7. Mostrar Reportes\r\n" + //
                        "8. Salir\r\n" + //
                        "Seleccione una opción:");
    }
}
