package com.nelynely.tema1.modulo2;

public class Endereco {

    private String pais, UF, cidade, numero, rua, complemento;
    private int CEP;

    public void definirPais(String pais) {
        this.pais = pais;
    }

    public void definirUF(String UF) {
        this.UF = UF;
    }

    public void definirCidade(String cidade) {
        this.cidade = cidade;
    }

    public void definirNumero(String numero) {
        this.numero = numero;
    }

    public void definirRua(String rua) {
        this.rua = rua;
    }

    public void definirComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void definirCEP(int CEP) {
        this.CEP = CEP;
    }

    public String recuperaPais() {
        return pais;
    }

    public String recuperaUF() {
        return UF;
    }

    public String recuperaCidade() {
        return cidade;
    }

    public String recuperaNumero() {
        return numero;
    }

    public String recuperaRua() {
        return rua;
    }

    public String recuperaComplemento() {
        return complemento;
    }

    public int recuperaCEP() {
        return CEP;
    }
}
