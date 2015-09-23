/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class FirstUniq {

    public static int randInt(int min, int max) {

    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
    
    public static void main(String[] args) {
        //Integer[] input = new Integer[]{1, 4, 2, 3, 1, 3, 7, 1, 1, 1};
        Integer[] input = new Integer[100000];
        
        for (int i = 0; i < 99999; i++) {
            input[i] = randInt(0, 100000);
        }
        
        long time = System.currentTimeMillis();
        
        
        System.out.println("firstUniqFinderList= " + firstUniqFinderList(input));
        System.out.println("t2: " + (System.currentTimeMillis() - time));
        
        time = System.currentTimeMillis();
        
        System.out.println("firstUniqFinder= " + firstUniqFinder(input));
        System.out.println("t1: "+ (System.currentTimeMillis() - time));
        
        time = System.currentTimeMillis();
        
        System.out.println("findUniqueLists= " + findUniqueLists(input));
        System.out.println("t3: "+ (System.currentTimeMillis() - time));

    }

    private static int firstUniqFinder(Integer[] input) {
        Map<Integer, Integer> map = new LinkedHashMap();
        for (int i = 0; i < input.length; i++) {
          // if (map.get(input[i]) == null) {
            if (map.put(input[i], 1) == null) {
            //  map.put(input[i], 1);
            } else {
                map.put(input[i], map.get(input[i]) + 1);
            }
        }
        Integer firstUnique = 0;
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
               if(entrySet.getValue() == 1) {
                   firstUnique = entrySet.getKey();
                   break;
               }            }
         return firstUnique == null ?  -1 : firstUnique;
    }
    
    private static int firstUniqFinderList(Integer[] input) { 
        Set<Integer> set = new HashSet();
        List<Integer> list = new LinkedList();
        for (int i = 0; i < input.length - 1; i++) {
            if(set.contains(input[i])){
                list.remove(input[i]);
            } else {
                set.add(input[i]);
                list.add(input[i]);
            }
        }
        return !list.isEmpty() ? list.get(0) : -1;
    }
    
    private static int findUniqueLists(Integer[] input) {
        List<Integer> list = new ArrayList<>();
        List<Integer> dups = new ArrayList<>();
        for (Integer i : input) {
            if (list.contains(i)) {
                dups.add(i);
            }
            list.add(i);
        }
        list.removeAll(dups);
        return list.get(0);
    }
}
