package com.nelynely.tema2.modulo1;

import java.util.UUID;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String nacionalidade, String naturalidade) {
        super(nome, nacionalidade, naturalidade);
        matricula = UUID.randomUUID().toString();
    }

    protected void atualizarID() {
        if(this.identificador.isBlank()) {
            this.identificador = UUID.randomUUID().toString();
        } else {
            System.out.println("ERRO: Código matrícula já existente!");
        }
    }
}
