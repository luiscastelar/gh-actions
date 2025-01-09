package com.iescastelar;

public class App {
    public static void main(String[] args) {
        System.out.print("Hola ");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("%s ", args[i]);
        }
        System.out.println("");
    }
}
