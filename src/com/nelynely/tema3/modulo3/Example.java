package com.nelynely.tema3.modulo3;

public class Example {

    public char[] separa(char[] arrj, int tamnh) {
        int partes;
        try {
            partes = arrj.length / tamnh;
            if(partes < 1) {
                char[] prim_parte = new char[tamnh];
                System.arraycopy(arrj, 0, prim_parte, 0, tamnh);
                return prim_parte;
            }
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fora dos limites: " + e);
        }
        return null;
    }
}
