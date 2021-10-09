package com.nelynely.tema2.modulo2;

import java.util.Calendar;

public class Pessoa {

    protected String nome , naturalidade , nacionalidade , identificador;
    private int idade;

    public Pessoa ( String nome, String identificador, String nacionalidade , String naturalidade ) {
        this.nome = nome;
        this.identificador = identificador;
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

    public String toString() {
        return  "Objeto: " + "\n\t -Classe " + getClass().getName() + "\n\t -Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
}
