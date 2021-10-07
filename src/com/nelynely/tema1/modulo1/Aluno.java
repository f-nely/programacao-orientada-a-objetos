package com.nelynely.tema1.modulo1;

import java.util.Random;

public class Aluno {

    // atributo
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    public Aluno(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    public void inserirNome() {
        nome = System.in.toString();
    }

    public String recuperarNome() {
        return nome;
    }

    public void definirNome(String nome) {
        this.nome = nome;
    }
}
