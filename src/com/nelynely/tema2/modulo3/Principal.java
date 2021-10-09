package com.nelynely.tema2.modulo3;

public class Principal {

    private static Pessoa ref[];

    public static void main(String[] args) {

        ref = new Pessoa[2];
        //Calendar data_nasc = Calendar.getInstance();
        //Calendar data_criacao = Calendar.getInstance();
        //data_nasc.set(1980 , 10 , 23);
        ref[0] = new Fisica("Marco Antônio", null, "Brasil", "Rio de Janeiro"); //"365.586.875-45"
        //data_criacao.set(1913 , 02 , 01 );
        ref[1] = new Juridica("Escola Novo Mundo Ltda", null, "Brasil", "Rio de Janeiro"); //"43.186.666/0026-32"
        ref[0].atualizarID("365.586.875-45");
        ref[1].atualizarID("43.186.666/0026-32");
    }
}
