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
public class SimplePow {
    public static void main(String[] args) {
        
        System.out.println("simplePow = " + simplePow( -5, 2));
         System.out.println("reqursionPow = " + reqursionPow( 3, 3));
    }
    public static double simplePow (double base, double power){
        double result = 1;
        while (power != 0){
        result = result*base;
        power--;    
        }
    return result;
    }
    
    public static double reqursionPow(double base, double power) {
//  a^b=(a^2)^(b/2)
//  when b i s even 
//  pow(a,b) = pow(a^2, b/2); 
//  when b is odd 
//  pow(a, b) = a*pow(a^2, b/2);
        if (power == 0) {
            return 1;
        } if (power == 1) {
            return base;
        }
        return ((power % 2 == 0) ? reqursionPow(base * base, (int) (power / 2.0)) : base * reqursionPow(base * base, (int) (power / 2.0)));
    }
}
