package com.nelynely.tema4.modulo3;

public final class Imutavel {

    private final ContadorSinc conta;

    protected Imutavel() {
        this.conta = new ContadorSinc(0);
    }
}
