/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
class MInOrMaxInLinkedList {
  public static void main(String[] args) {
//    int n = 8000;
// 
//    int g[][] = new int[n][n];
//    long st, en;
// 
//    // one
//    st = System.nanoTime();
//    for(int i = 0; i < n; i++) {
//      for(int j = 0; j < n; j++) {
//        g[i][j] = i + j; 
//      }
//    }
//    en = System.nanoTime();
//    System.out.println("\nOne time " + (en - st)/1000000.d + " msc");
// 
//    // two
//    st = System.nanoTime();
//    for(int i = 0; i < n; i++) {
//      g[i][i] =  i + i;
//      for(int j = 0; j < i; j++) {
//        g[j][i] = g[i][j] = i + j; 
//      }
//    }
//    en = System.nanoTime();
//    System.out.println("\nTwo time " + (en - st)/1000000.d + " msc");
    
//    Runnable mytest = new Runnable() {
//
//        @Override
//        public void run() {
//            System.out.println("Helllo");
////            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    };
//     Thread thread = new Thread(mytest);
//   thread.start();
    
    List mylist = new LinkedList();
    mylist.add(24);mylist.add(20);mylist.add(12);mylist.add(10);mylist.add(7);mylist.add(4);   
    
        if (mylist == null || mylist.isEmpty()) {
   mylist = null;
        }
        int result = (int) mylist.iterator().next();
        System.out.println("result " + result);
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            int next = (int) it.next();
            if (result > next) {
                result = next;
            }
        }
        System.out.println("MIN: " + result);
        
  }
}
