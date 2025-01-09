package com.iescastelar;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        metodoEcho(args);

        App app = new App();
        int resultado = app.suma(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("Suma: " + resultado);

    }

    private static void metodoEcho(String[] args) {
        System.out.print("Calculadora con entrada: ");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("%s ", args[i]);
        }
        System.out.println("");
    }

    int suma(int a, int b) {
        return a + b;
    }
}
