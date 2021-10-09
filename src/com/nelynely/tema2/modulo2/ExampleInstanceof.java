package com.nelynely.tema2.modulo2;

public class ExampleInstanceof {

    private static Pessoa p1, p3;
    private static Fisica p2;

    public static void main(String[] args) {

        p1 = new Fisica("Marco Antônio", "365.586.875-45", "Brasil", "Rio de Janeiro");
        p2 = new Fisica("Marco Antônio", "365.586.875-45", "Brasil", "Rio de Janeiro");
        p3 = new Pessoa("Classe Pessoa", null, "Brasil", "Rio de Janeiro");

        if ( p1 instanceof Pessoa )
            System.out.println("p1 é instância do tipo Pessoa.");
        else
            System.out.println("p1 não é instância do tipo Pessoa.");
        if ( p2 instanceof Pessoa )
            System.out.println("p2 é instância do tipo Pessoa.");
        else
            System.out.println("p2 não é instância do tipo Pessoa.");
        if ( p3 instanceof Pessoa )
            System.out.println("p3 é instância do tipo Pessoa.");
        else
            System.out.println("p3 não é instância do tipo Pessoa.");
        if ( p3 instanceof Fisica )
            System.out.println("p3 é instância do tipo Física.");
        else
            System.out.println("p3 não é instância do tipo Física.");
    }
}
