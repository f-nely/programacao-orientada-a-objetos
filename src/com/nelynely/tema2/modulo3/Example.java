package com.nelynely.tema2.modulo3;

public class Example {

    private static Derivada ref;
    //Métodos
    public static void main (String args[]) {
        ref = new Derivada ( ); //instancia objeto do tipo Derivada
        System.out.println ( "=> Imprime o valor de var_base");
        ref.imprimirVarBase();
        System.out.println ( "=> Atualiza o valor de var_der com downcasting (var_der = 1000)");
        //ref.atualizarVarSub(1000);
        System.out.println ( "=> Imprime o valor de var_der com downcasting");
        //ref.imprimirVarSub();
        System.out.println ( "=> Imprime o valor de var_der");
        ref.imprimirVarDer();
    }
}
