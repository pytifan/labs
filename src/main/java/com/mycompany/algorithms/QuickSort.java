/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 25, 3, 17, 5, 21, 2, 4, 6, 7};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        System.out.println("Sorted arr[]: " + Arrays.toString(arr));
    }

    private void sort(List<Integer> input) {

        int[] array = input.stream().mapToInt(i-> i).toArray();

        qickSorter(array, array[0], array.length - 1);
    }

   private void qickSorter(int[] arr, int start, int end) {
       int index = partitioner (arr, start, end);
       if (start < index - 1){
           qickSorter(arr, start, index -1);
       }
       if (index < end){
           qickSorter(arr, index, end);
       }
   }
   
    private static int partitioner(int arr[], int start, int end){
        int i = start, j = end, tmp;
        int midElemValue = arr [(start + end)/2];
        while (i <= j) {
            while (arr[i] < midElemValue) {
                i++;
            }
            while (arr[j] > midElemValue) {
                j--;
            }
            if (i <= j){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;j--;
            } 
        }
    return i;
    }
}
