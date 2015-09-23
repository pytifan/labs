/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import static com.mycompany.algorithms.FirstUniq.randInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class TestUnic {

    public static void main(String[] args) {
        Integer[] input = new Integer[]{1, 4, 2, 3, 5, 1, 3, 7, 1, 1, 2, 1, 4, 5, 5, 5, 6, 9};
        //Integer[] input = new Integer[100000];
//        for (int i = 0; i < 99999; i++) {
//            input[i] = randInt(0, 100000);
//        }
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println("s1 == s2 ? " + (s1 == s2)); // false

        List unique = new ArrayList();
        List deletedFromUniquie = new ArrayList();

        for (Integer e : input) {
            if (unique.contains(e)) {
                unique.remove(e);
                deletedFromUniquie.add(e);
            } else if (deletedFromUniquie.contains(e)) {
                // NOP
            } else {
                unique.add(e);
            }
        }
        System.out.println("unique.get(0)=" + unique.get(0));
        System.out.println("getSecondUniq=" + getSecondUniq(Arrays.asList(input)));
    }

    public static List getSecondUniq(List<Integer> input) {
        List<Integer> res = new ArrayList<>();
        for (Integer elem : input) {
            int count = 0;
            for (Integer elem2 : input) {
                if (input.contains(elem2)) {
                    count++;
                }
                if (count < 2) {
                    res.add(elem);
                }
            }
        }
        Integer resul = res.get(1);
        return res;
    }

}
