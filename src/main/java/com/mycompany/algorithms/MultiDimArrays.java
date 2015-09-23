/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class MultiDimArrays {

    public static void main(String[] args) {
        List arr = new ArrayList<>();
        arr.add(0);
        arr.add(100);
        List arr1 = new ArrayList<>();
        arr1.add(205);
        arr1.add(40);
        arr1.add(30);
        List arrsimple = new ArrayList();
        arrsimple.add(4);
        arrsimple.add(300);
        arrsimple.add(new ArrayList(Arrays.asList(7, 55, 66, 78, 200)));
        arrsimple.add(new ArrayList(Arrays.asList(arr, 7, 77, 17, 201)));
        arrsimple.add(5);
        List arr4 = new ArrayList<>();
        arr4.add(44);arr4.add(44);arr4.add(44);
        arr4.add(arr1);
        arrsimple.add(new ArrayList(Arrays.asList(arr1, 505, 6, 1, 8, arr4)));
        System.out.println("AAAAAArray: " + arrsimple.toString()); 
        System.out.println("max: " + maxMultiDimens(arrsimple));
    }
    
    public static int maxMultiDimens(List arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                max = ((int)arr.get(i) > max ) ? (int)arr.get(i) : max;
                System.out.println("i: " + i + " max: " + max);

            } else {
                System.out.println("we are in inner array");
                max = (maxMultiDimens((List) arr.get(i)) > max) ? maxMultiDimens((List) arr.get(i)) : max;
                System.out.println("i: " + i + " max: " + max);
            }
        }
         return max;
    }    
}
