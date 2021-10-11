package com.nelynely.tema4.modulo2;

import java.util.concurrent.Semaphore;

public class Exemplo {

    Semaphore sem = new Semaphore(50, true); //Define até 50 acessos e o uso de FIFO

    /*sem.acquire(); //Solicita 1 acesso
    ... // Região crítica
    sem.release();  //Libera o acesso obtido
    ... //Código não crítico
    sem.acquire(4); //Solicita 1 acesso
    ... // Região crítica
    sem.release(4); //Libera os 4 acessos obtidos
    ... //Código não crítico*/
}
