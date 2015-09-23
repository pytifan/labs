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
public class Polyndrom {
    public static void main(String[] args) {
         
        String testit = "topot";
        System.out.println("The word " + testit + "\n" + " polyndrom or not (true / false)?: " + toponim(testit));
    }
    public static String toponim(String testit) {
        if (testit.equalsIgnoreCase(new StringBuffer(testit).reverse().toString())) {
            return "true";
        } else {
            return "false";
        }
    }
}
