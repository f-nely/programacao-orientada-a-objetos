package com.nelynely.tema3.modulo2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int dividendo, divisor = 0;
        String controle = "s";

        Calculadora calc = new Calculadora();
        Scanner s = new Scanner(System.in);
        do {

            System.out.println("Entre com o dividendo.");
            dividendo = s.nextInt();
            System.out.println("Entre com o divisor.");
            dividendo = s.nextInt();
            System.out.println("O quociente é: " + calc.divisao(dividendo, divisor));
            System.out.println("Repetir?");
            controle = s.next().toString();

        } while (!controle.equals("n"));

        s.close();
    }
}
