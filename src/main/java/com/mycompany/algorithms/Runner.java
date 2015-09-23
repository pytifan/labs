/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.Arrays;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class Runner {
    public static void main(String[] args) {
        //Fibonachi with ARRAY
        FibonachiAlgo testFib = new FibonachiAlgo();
        System.out.println("testFib.fib2(10): " + Arrays.toString(testFib.fib2(10)));
        //Fibonachi with recursion
        FibonachiRecurs testFibRec = new FibonachiRecurs();
        System.out.println("testFibRec.iteratFib(10): " + Arrays.toString(testFibRec.iteratFib(10)));
    }
}
