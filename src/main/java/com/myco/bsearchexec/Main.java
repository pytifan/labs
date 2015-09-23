/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myco.bsearchexec;


/* @author Oleksii_Prokopenko */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Main main_ref = new Main();
        System.out.println("Main Thread");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 7; i++) {
                    //wait();
                    System.out.println("Not Main Thread");
                }
            }
        }, "NotMainThread");

        //  main_ref.notifier(thread);
       
        thread.start();

    }

    synchronized void notifier(Thread thread) {
        thread.notifyAll();
    }
}
