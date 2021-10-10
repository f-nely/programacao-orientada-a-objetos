package com.nelynely.tema3.modulo2;

public class Calculadora {

    public int divisao(int dividendo, int divisor) {
        try {
            if(divisor == 0 ) {
                throw new ArithmeticException("Divisor nulo.");
            }
        } catch (Exception e) {
            System.out.println("ERRO: Divisão por zero! " + e.getMessage());
            return 999999999;
        }
        return dividendo / divisor;
    }
}
