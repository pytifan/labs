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
public class Merge {

    public static void main(String[] args) {
        int[] a = new int[] {3, 10, 8, 91, 1, 6, 9, 34, 5};
        System.out.println("Before sorting a []: " + Arrays.toString(a));
        sort(a);
        System.out.println("After sorting a []: " + Arrays.toString(a));
    }

    public static void sort(int[] a) {
        sort(a, 0, a.length);
    }

    // Sort a[lo, hi). 

    public static void sort(int[] a, int lo, int hi) {
        int N = hi - lo;
        if (N <= 1) {return;}
        // recursively sort left and right halves 
        int mid = lo + N / 2;
        sort(a, lo, mid); //sort a[lo, mid)
        sort(a, mid, hi); //sort a[mid, hi) 
        // merge sorted halves (see previous slide)
        System.out.println(Arrays.toString(a));
        merge(a, lo, mid, hi, N);
    }

    private static void merge(int[] a, int lo, int mid, int hi, int N) {
        int[] aux = new int[N];
// merge into auxiliary array 
        int i = lo, j = mid;
        for (int k = 0; k < N; k++) {
            if (i == mid) {
                aux[k] = a[j++]; //left side of a done already 
            } else if (j == hi) {
                aux[k] = a[i++]; //right side of a done already 
            } else if (a[j] < a[i]) {
                aux[k] = a[j++];
            } else {
                aux[k] = a[i++];
            }
        }
// copy back from aux into a 
        for (int k = 0; k < N; k++) {
            a[lo + k] = aux[k];
        }
    }
}
