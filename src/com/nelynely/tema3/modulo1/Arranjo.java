package com.nelynely.tema3.modulo1;

public class Arranjo {

    int vetor[] = {1, 2, 3, 4};

    int getElemento(int i) {
        try {
            if (i < 0 || i > 3)
                throw new IllegalAccessException();
        } catch (Exception e) {
            System.out.println("ERRO: índice fora dos limites do vetor.");
        }
        return vetor[i];
    }
}
