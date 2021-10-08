package com.nelynely.tema1.modulo2;

import java.time.Year;
import java.util.Calendar;

public class Pessoa {

    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    public Pessoa(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    protected void atualizarNome(String nome) {
        this.nome = nome;
    }

    protected void atualizarIdade(int idade) {
        this.idade = calcularIdade();
    }

    protected int recuperarIdade() {
        return this.idade;
    }

    protected void atualizarCPF(long CPF) {
        this.CPF = CPF;
    }

    protected long recuperarCPF() {
        return this.CPF;
    }

    protected void atualizaEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    protected String recuperarEndereco() {
        return this.endereco.recuperaPais() + " - " + this.endereco.recuperaUF() + " - " + this.endereco.recuperaCidade() + " - " + this.endereco.recuperaNumero() + " - " + this.endereco.recuperaRua() + " - " + this.endereco.recuperaComplemento();
    }

    private int calcularIdade() {
        int lapso;

        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(Calendar.YEAR) - data_nascimento.get(Calendar.YEAR);

        //( ( data_nascimento.get(MONTH) > hoje.get(MONTH) ) || ( data_nascimento.get(MONTH) == hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE) ) )
        if ((data_nascimento.get(Calendar.MONTH) > hoje.get(Calendar.MONTH) || (data_nascimento.get(Calendar.MONTH) == hoje.get(Calendar.MONTH) && data_nascimento.get(Calendar.DATE) > hoje.get(Calendar.DATE)))) {
            lapso--;
        }

        return lapso;
    }
}
