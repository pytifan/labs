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
public class TestItt {
    private static final int counts = 10;
    private static final int sleepTime = 100;

   public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new Runnable(){
           
           @Override
           public void run(){     System.out.println("ping");
           }
       });
       Thread t2 = new Thread(new Runnable(){
          
           @Override
           public void run(){     System.out.println("pong");
           }
       });
       
      // for(int i = 0; i < counts; i++){
           t1.start();
           t1.sleep(sleepTime);
           t2.start();
           t1.sleep(sleepTime);
     //  }
   }       
   }
