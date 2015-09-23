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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class ThreeMostFreqStrings {

    public static void main(String[] args) {

        List<String> input = new ArrayList(Arrays.asList("XXX", "XXX", "XXX", "sdf", "XXX", "a", "XXX", "a", "a", "uiki", "sdf", "XXX", "XXX"));
        Map<String, Integer> treeMap = new TreeMap<>();
        List<Integer> result = new ArrayList<>(Arrays.asList(input.size(), input.size() - 1, input.size() - 2));

        input.stream().forEach((it) -> {
            if (treeMap.containsKey(it)) {
                treeMap.put(it, treeMap.get(it) + 1);
            } else {
                treeMap.put(it, 1);
            }
        });
        System.out.println("map: " + treeMap);

        for (String temp : treeMap.keySet()) {
            System.out.println(temp + " : " + Collections.frequency(input, temp));
        }
        System.out.println(findGreatest(treeMap, 2));

        List<Integer> list = new ArrayList<Integer>(treeMap.values());
        Comparator<Integer> SENIORITY_ORDER = new Comparator<Integer>() {
            @Override
            public int compare(Integer e1, Integer e2) {
                return e2.compareTo(e1);
            }
        };
        Collections.sort(list, SENIORITY_ORDER);
        //Collections.reverseOrder());
        List<Integer> top3 = list.subList(0, 3);
        System.out.println("top3: " + top3);

        System.out.println("Result: " + findFrequency(treeMap));

    }

    public static List<String> findFrequency(Map<String, Integer> treeMap) {

        ArrayList<String> output = new ArrayList<String>(2);

        output.add("");
        output.add("");
        output.add("");

        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();

        int biggest = 0, secondBiggest = 0, thirdBiggest = 0;

        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            if (value > biggest) {
                thirdBiggest = secondBiggest;
                output.set(2, output.get(1));

                secondBiggest = biggest;
                output.set(1, output.get(0));

                biggest = value;
                output.set(0, key);
            } else if (value > secondBiggest) {
                thirdBiggest = secondBiggest;
                output.set(2, output.get(1));

                secondBiggest = value;
                output.set(1, key);
            } else if (value > thirdBiggest) {
                thirdBiggest = value;
                output.set(2, key);
            }
        }
        return output;
    }

    private static <K, V extends Comparable<? super V>> List<Entry<K, V>> findGreatest(Map<K, V> map, int n) {
        Comparator<? super Entry<K, V>> comparator = new Comparator<Entry<K, V>>() {
            @Override
            public int compare(Entry<K, V> e0, Entry<K, V> e1) {
                V v0 = e0.getValue();
                V v1 = e1.getValue();
                return v0.compareTo(v1);
            }
        };
        PriorityQueue<Entry<K, V>> highest = new PriorityQueue<Entry<K, V>>(n, comparator);
        for (Entry<K, V> entry : map.entrySet()) {
            highest.offer(entry);
            while (highest.size() > n) {
                highest.poll();
            }
        }
        List<Entry<K, V>> result = new ArrayList<Map.Entry<K, V>>();
        while (highest.size() > 0) {
            result.add(highest.poll());
        }
        return result;
    }
}

//class A {
//
//    Number method(Number arg) {
//        return null;
//    }
//    
//    private Object o;
//    public void method2 (){
//        try {
//            o.wait();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
//  
//class B extends A {
//    
//    Object arr = new Integer[10];
//    Object[] ar = new Integer[10];
//
//    @Override
//    Integer method(Number arg) {
//        return null;
//    }
//}      }
//    }
//}

