package com.nelynely.tema1.modulo2;

import java.util.Calendar;
import java.util.UUID;

public class Diretor extends Empregado {

    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }

    protected void gerarMatricula() {
       matricula = "E-" + UUID.randomUUID().toString();
    }

    protected void alterarMatricula() {
        gerarMatricula();
    }

    protected void alterarmatricula(String matricula) {
        this.matricula = matricula;
    }
}
