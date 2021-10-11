package com.nelynely.tema4.modulo2;

import java.util.concurrent.Semaphore;

public class PingPong {

    private Semaphore s1, s2;
    private Ping ping;
    private Pong pong;
    private Controle contador;
    private int tamanho_partida;

    public PingPong(int tamanho_partida) throws InterruptedException {
        s1 = new Semaphore(0);
        s2 = new Semaphore(1);
        contador = new Controle(tamanho_partida);
        ping = new Ping(s1,s2, contador);
        pong = new Pong(s1,s2, contador);
       // new Thread(ping).start();
    }
}
