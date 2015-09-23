/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms.codility;

import java.util.Arrays;
/**
 *
 * @author Oleksii_Prokopenko
 */
public class DNA {
    private static int[] solution(String S, int[] P, int[] Q) {
        int[] mins = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int tmpLenght = Q[i] - P[i];
            int[] resultArr = new int[tmpLenght + 1];
         //   Arrays.fill(resultArr, tmpLenght + 1);
            for (int j = 0; j <= tmpLenght; j++) {
                switch (S.charAt(P[i] + j)) {
                    case 'A':
                        resultArr[j] = 1;
                        break;
                    case 'C':
                        resultArr[j] = 2;
                        break;
                    case 'G':
                        resultArr[j] = 3;
                        break;
                    case 'T':
                        resultArr[j] = 4;
                        break;
                    default:
                        resultArr[j] = 5;
                        break;
                }
            }
           // System.out.println("Temp Array: " + Arrays.toString(resultArr));
            mins[i] = Arrays.stream(resultArr).distinct().min().getAsInt();
           // System.out.println("mins: " + Arrays.toString(mins));
        }
        //int finalMin = Arrays.stream(mins).min().getAsInt();
        //System.out.println("final int: " + finalMin);
        return mins;
    }

    public static void main(String[] args) {
        String S = "CAGCCTA";
        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6};
        System.out.println("Result mins =" + Arrays.toString(solution(S, P, Q)));
    }
}
