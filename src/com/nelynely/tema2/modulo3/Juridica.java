package com.nelynely.tema2.modulo3;

public class Juridica extends Pessoa{
    public Juridica(String nome, String identificador, String nacionalidade, String naturalidade) {
        super(nome, identificador, nacionalidade, naturalidade);
    }

    @Override
    protected boolean atualizarID(String identificador) {
        return false;
    }
}
