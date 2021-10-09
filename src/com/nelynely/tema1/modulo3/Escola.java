package com.nelynely.tema1.modulo3;


import com.nelynely.tema1.modulo1.Departamento;
import com.nelynely.tema1.modulo2.Endereco;

import java.util.*;
import java.util.stream.Collectors;

public class Escola {

    private String nome, CNPJ;
    private Endereco endereco;
    private List departamentos;
    private List discentes;

    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>();
        this.discentes = new ArrayList<Aluno>();
    }

    public void criarDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento());
    }

    public void fecharDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void matricularAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void trancarMatriculaAluno(Aluno aluno) {
        discentes.remove(aluno);
    }


    public void agruparAlunos ( ) {
        Map < String , List < Aluno > > agrupamento = (Map<String, List<Aluno>>) discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
        System.out.println ("Resultado do agrupamento por naturalidade: ");
        agrupamento.forEach (( String chave , List < Aluno > lista) -> System.out.println (chave + " = " + lista ));
    }

    public void agruparAlunos ( int a ) {
        Map < String , Set < Aluno > > agrupamento = (Map<String, Set<Aluno>>) discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade , Collectors.toSet()));
        System.out.println ("Resultado do agrupamento por naturalidade: ");
        agrupamento.forEach (( String chave , Set< Aluno > conjunto) -> System.out.println (chave + " = " + conjunto ));
    }
}
