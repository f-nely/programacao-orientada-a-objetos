package com.nelynely.tema1.modulo1;

public class Referencia {

    private Aluno aluno1, aluno2;

    public Referencia() {
        aluno1 = new Aluno("Carlos", 20);
        aluno2 = new Aluno("Ana", 23);
        System.out.println("O nome do aluno aluno1 é " + aluno1.recuperarNome());
        System.out.println("O nome do aluno aluno2 é " + aluno2.recuperarNome());
        aluno2 = aluno1;
        aluno2.definirNome("Flávia");
        System.out.println("O nome do aluno aluno1 é " + aluno1.recuperarNome());
        manipulaAluno(aluno1);
        System.out.println("O nome do aluno aluno1 é " + aluno1.recuperarNome());
    }

    public void manipulaAluno(Aluno aluno) {
        aluno.definirNome("Márcia");
    }
}
