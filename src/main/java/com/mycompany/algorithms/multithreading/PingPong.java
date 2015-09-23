/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms.multithreading;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class PingPong {
    private final int MAX = 10;
    private volatile int counter = 0;
    private volatile boolean ponged = true;
    private volatile boolean pinged = true;
 
    public synchronized void ping() {
        try {
            if (ponged) {
                counter++;
                System.out.println("Ping  " + counter);
                pinged = true;
            }
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
    public synchronized void pong() {
        if (pinged) {
            counter++;
            System.out.println("Pong  " + counter);
            ponged = true;
        }
        notifyAll();
    }
 
    public static void main(String... arg) {
        final PingPong pingpong = new PingPong();
        new Thread() {
            public void run() {
                while (pingpong.counter < pingpong.MAX)
                    pingpong.ping();
            }
        }.start();
        new Thread() {
            public void run() {
                while (pingpong.counter < pingpong.MAX)
                    pingpong.pong();
            }
        }.start();
    }
}
