/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class TransformArray {
    public static void main(String[] args) {
        int [] input = new int [] {1, 4, 0, 0, 0, 15, 0};
        transormater(input);
    }
    public static void transormater (int[] arr) {
        List<Integer> tmp = new ArrayList(arr.length);
        List<Integer> OUTPUT = new ArrayList();
        Collections.fill(OUTPUT, 0);
        int count = 0;
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == 0){
                count++;
                OUTPUT.add(0);
                //tmp.add(count, 0);
                continue;
            }    
            tmp.add(arr[i]);
            System.out.println("tmp " + tmp + " i " + i);
            System.out.println("count " + count);
        }
            System.out.println("After for tmp " + tmp);
            System.out.println("After for count " + count);
        
        System.out.println("OUTPUT.size() " + OUTPUT.size());
        OUTPUT.addAll(count, tmp);
        System.out.println("OUTPUT: " + OUTPUT);
        
    }
}
