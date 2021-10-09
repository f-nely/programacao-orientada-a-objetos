package com.nelynely.tema1.modulo3;

public class Aluno {

    private String matricula, nome, naturalidade;

    public Aluno(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", nome, naturalidade);
    }

    public String recuperarNaturalidade() {
        return this.naturalidade;
    }

}
