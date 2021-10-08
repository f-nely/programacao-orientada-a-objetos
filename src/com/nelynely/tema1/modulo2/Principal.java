package com.nelynely.tema1.modulo2;

import java.util.Calendar;

public class Principal {

    private static Aluno aluno;
    private static Endereco endereco;
    private static Empregado empregado, diretor;

    public static void main(String[] args) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
        endereco.definirCidade("Rio de Janeiro");
        endereco.definirRua("Avenida Rio Branco");
        endereco.definirNumero("156A");
        endereco.definirCEP(20040901);
        endereco.definirComplemento("Bloco 03 - Ap 20.005");
        aluno = new Aluno("", data, 901564098, endereco);
        idade = aluno.recuperarIdade();
        aluno.atualizarIdade(idade);
        System.out.println("Idade: " + aluno.recuperarIdade());
        System.out.println("Endereço: " + aluno.recuperarEndereco());

        empregado = new Empregado("Clara Silva", data, 901564098, null);
        empregado.gerarMatricula();
        diretor = new Diretor("Marco Antônio", data, 901564098, null);
        diretor.gerarMatricula();
        System.out.println("A matrícula do Empregado é: " + empregado.recuperarMatricula());
        System.out.println("A matrícula do diretor é: " + diretor.recuperarMatricula());
    }
}
