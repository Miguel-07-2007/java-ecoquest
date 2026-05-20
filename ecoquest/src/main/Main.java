package com.miguelmontoya;

import java.util.Scanner;

import com.miguelmontoya.controller.EcoQuestService;

public class Main {
    public static void main(String[] args) {
        EcoQuestService ecoQuestService = new EcoQuestService();
        Scanner scanner = new Scanner(System.in);

        // Registrar voluntario
        ecoQuestService.registrarVoluntario(scanner);
    }
}