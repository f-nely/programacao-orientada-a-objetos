package com.nelynely.tema4.modulo1;

public class ThreadInterface implements Runnable {

    long numero;

    ThreadInterface(long numero) {
        this.numero = numero;
    }

    public void run() {
        // implementa o comportamento apropriado
    }
}
