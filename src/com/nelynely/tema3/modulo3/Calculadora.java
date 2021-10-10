package com.nelynely.tema3.modulo3;

public class Calculadora {

    public int divisao(int dividendo, int divisor) throws ArithmeticException {

        try {
            if (dividendo == 0) {
                throw new ArithmeticException("Divisor nulo.");
            }

        } catch (Exception e) {
            System.out.println("ERRO: Divisão por zero! " + e.getMessage());
            throw e;
        }
        return dividendo / divisor;
    }
}
