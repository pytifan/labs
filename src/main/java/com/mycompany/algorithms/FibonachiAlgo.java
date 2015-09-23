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
public class FibonachiAlgo {
    
    public  int [] fib2 (int n) {
    int [] f = new int [n];
    f[0] = 0;   f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f;
}
}
