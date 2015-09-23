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
public class PingPong2 {
    public static void main(String... arg) throws InterruptedException {
    Object lock = new Object();    
    
    Thread thread1 = new Thread(new PingClass(lock));
    thread1.start();
    
    Thread thread2 = new Thread(new PongClass(lock));
    thread2.start();
    
    }
}
