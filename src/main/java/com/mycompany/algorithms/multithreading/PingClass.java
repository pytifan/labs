/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class PingClass implements Runnable {

    private final Object lock;
    
    public PingClass(Object lock) {
        this.lock = lock;
    }
    
    @Override
    public void run() {
        try {            
                synchronized(lock) {
                    for (int i = 0; i < 5; i++) {
                        ping();
                        lock.notifyAll();
                        if(i != 4) {
                            lock.wait();
                        }
                    }                   
                }
        } catch (InterruptedException ex) {
            Logger.getLogger(PingClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void ping() {
        System.out.println("Ping");
    }
}
