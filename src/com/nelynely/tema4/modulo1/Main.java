package com.nelynely.tema4.modulo1;

public class Main {

    public static void main(String[] args) {

        // extensão de Thread
        ThreadSubclasse novaT = new ThreadSubclasse(200);
        novaT.start();

        // implementação de Runnable
        ThreadInterface newT = new ThreadInterface(200);
        new Thread(newT).start();
    }
}
