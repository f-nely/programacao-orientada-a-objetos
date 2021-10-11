package com.nelynely.tema4.modulo2;

public class Controle {

    private int contador = 0;

    public Controle(int contador) {
        this.contador = contador;
    }

    public synchronized int getControle() {
       return this.contador;
    }

    public synchronized void decrementa() {
        this.contador--;
    }
}
