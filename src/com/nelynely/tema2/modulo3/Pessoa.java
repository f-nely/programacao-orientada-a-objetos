package com.nelynely.tema2.modulo3;

public abstract class Pessoa {

    protected String nome , naturalidade , nacionalidade , identificador;
    private int idade;

    public Pessoa ( String nome, String identificador, String nacionalidade , String naturalidade ) {
        this.nome = nome;
        this.identificador = identificador;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }

    protected abstract boolean atualizarID(String identificador);

    protected String recuperarID ( ) {
        return this.identificador;
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

    protected String recupearID() {
        return this.identificador;
    }

    public String toString() {
        return  "Objeto: " + "\n\t -Classe " + getClass().getName() + "\n\t -Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
}
