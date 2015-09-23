/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class MergeTwoSortedArrays {

//private static Double[] getArray(Object testObj2){
//    int arrlength = Array.getLength(testObj2);
//    Double[] outputArray = new Double[arrlength];
//    for(int i = 0; i < arrlength; ++i){
//       outputArray[i] = (Double) Array.get(testObj2, i);
//    }
//    return outputArray;
//}
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 7, 9, 10, 22, 50};
        Integer[] arr2 = {2, 3, 5, 8, 11, 23, 88, 90, 95, 100};
        System.out.println("sortedResult: " + Arrays.toString(sorter(arr, arr2)));
    }

    static Integer[] sorter(Integer[] arr, Integer[] arr2) {
        Integer result[] = new Integer[arr.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                result[k] = arr[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (k < result.length) {
            if (i == arr.length) {
                result[k] = arr2[j];
                j++;
            } else {
                result[k] = arr[i];
                i++;
            }
            k++;
        }
        return result;
    }

}
