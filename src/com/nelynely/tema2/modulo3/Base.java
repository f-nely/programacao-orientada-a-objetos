package com.nelynely.tema2.modulo3;

public class Base {

    protected int var_base;

    public Base() {
        var_base = -1;
    }

    protected void atualizarVarBase(int valor) {
        this.var_base = valor;
    }

    protected void imprimirVarBase() {
        System.out.println("O valor de var_base eh " + this.var_base);
    }
}
