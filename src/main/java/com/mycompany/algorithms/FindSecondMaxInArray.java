/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class FindSecondMaxInArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 7, 9, 10, 22, 50};
        List<Integer> arrList = Arrays.asList(arr);
        System.out.println("max1: " + Collections.max(arrList));
        System.out.println("max2: " + secondMaxFinder(arr));
    }
   public static int secondMaxFinder (Integer[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr[arr.length - 2];
    }
}
