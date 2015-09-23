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
class AA { 
    protected Number m(int k) { 
        System.out.println("class A, method m : " + ++k);
        return k;
    } 
} 
 
class BB extends AA { 
    @Override
    public Integer m(int k) { 
        System.out.println("class B, method m : " + k++); 
        return k; 
    } 
} 
 
public class Polymorph { 
    public static void main(String args[]) { 
        AA a = new BB();        
        String s = new String ();
        a.m(34); 
    } 
} 
