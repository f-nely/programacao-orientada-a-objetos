package com.nelynely.tema2.modulo1;

public class Pessoa {

    protected String nome, nacionalidade, naturalidade, identificador;

    public Pessoa(String nome, String nacionalidade, String naturalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }

    protected void atualizarNome(String nome) {
        this.nome = nome;
    }

    protected String recuperarNome() {
        return nome;
    }

    protected String recuperarNacionalidade() {
        return nacionalidade;
    }

    protected String recuperarNaturalidade() {
        return this.naturalidade;
    }

    protected void atualizarID(String identificador) {
        this.identificador = identificador;
    }

    protected String recupearID() {
        return this.identificador;
    }

}
