package com.nelynely.tema2.modulo2;

import java.util.Calendar;

public class Main {

    private static Pessoa grupo[];

    public static void main(String[] args) {
        grupo = new Pessoa[2];
        grupo[0] = new Fisica("Marco Antônio", "365.586.875-45", "Brasil", "Rio de Janeiro");
        grupo[1] = new Pessoa("Escola Novo Mundo Ltda", "43.186.666/0026-32", "Brasil", "Rio de Janeiro");

        for(int i = 0; i <=1; i++) {
            System.out.println("grupo[" + i + "]: " + grupo[i].toString());
        }
    }
}
