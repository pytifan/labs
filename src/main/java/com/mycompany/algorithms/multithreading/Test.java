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
public class Test {

    private volatile int counter = 1;
    private volatile boolean stop = false;

    public static void main(String... args) {
        final Test test = new Test();
        
        new Thread() {
            @Override
            public void run() {
                while (!test.stop) {
                        System.out.println("test.counter: " + test.counter++);
                }
            }
        }.start();
        
        
        new Thread() {
            @Override
            public void run() {
                while (test.counter < 300) {
                    System.out.println("second: " + test.counter);
                }
                test.stop = true;
            }
        }.start();
    }
}
