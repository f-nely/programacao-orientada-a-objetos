package com.nelynely.tema3.modulo2;

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) throws InterruptedException {

        int divisor = 0 , dividendo, quociente = 0;
        String controle = "s";

        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Entre com o dividendo.");
            dividendo = s.nextInt();
            System.out.println("Entre com o divisor.");
            dividendo = s.nextInt();
            try {
                if(divisor == 0) {
                    throw new ArithmeticException("Divisor nulo.");
                }
            } catch(Exception e) {
                System.out.println("ERRO: Divisão por zero! " + e.getMessage());
            } finally {
                System.out.println("Bloco finally.");
            }

            System.out.println("O quociente é: " + quociente);
            System.out.println("Repetir?");
            controle = s.next().toString();

        } while (controle.equals("s"));

        s.close();
    }
}
