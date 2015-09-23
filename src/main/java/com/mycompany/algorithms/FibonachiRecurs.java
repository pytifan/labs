/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class FibonachiRecurs {
    
    public int [] iteratFib (int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = fib1(i);
        }
        return result;
    }

    public int fib1(int n) {
        if (n == 0) {     return 0;        }
        if (n == 1) {     return 1;        }
        else return fib1(n - 1) + fib1(n - 2);
    }

}
