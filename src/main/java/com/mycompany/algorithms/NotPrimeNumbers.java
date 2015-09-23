/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class NotPrimeNumbers {
    
    void printNotPrimeNumbers(int n) {
    if (n <=1) {
        return;
    }
    
    int status = 1;
    final List<Integer> noPrimes = new ArrayList();
    final List<Integer> Primes = new ArrayList();
    
        for (int i = 1; i < n; i++) {
            boolean isPrime = true;
            //check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    noPrimes.add(i);
                    break;
                }
            }
            if (isPrime) {
                Primes.add(i);
            }
        }
                 
    
    StringBuilder builder = new StringBuilder();
    builder.append("Not Prime Numbers:");
    for (Integer NotPrime : noPrimes) {
        builder.append(" ");
        builder.append(NotPrime);
    }
    StringBuilder builderForPrimes = new StringBuilder();
    builderForPrimes.append("Prime Numbers:");
    for (Integer prime : Primes) {
        builderForPrimes.append(" ");
        builderForPrimes.append(prime);
    }
    
    System.out.println(builder.toString());
    System.out.println(builderForPrimes.toString());
}
    
    public static void main(String[] args) {
        NotPrimeNumbers twest = new NotPrimeNumbers();
        twest.printNotPrimeNumbers(51);
    }
}
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,