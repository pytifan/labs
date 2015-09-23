/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Oleksii_Prokopenko
 */
public class MiddleOfLilnkedList {

    private static Object linkedList;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(14);
    //    list.add(15);
//        Iterator itFast = list.iterator();
//        Iterator itSlow = list.iterator();
//        Object slow = null;
//        while (itFast.hasNext()) {         
//                   itFast.next();
//            slow = itSlow.next();
//            if(itFast.hasNext()) {
//               itFast.next();               
//            }        
//        }    
//while ( p2.next != null ) {
//    p2 = p2.next;
//    if (p2.next != null) {
//        p2 = p2.next;
//        p1 = p1.next;
//    }
//}

//        while (itFast.hasNext()) {
//            itFast.next();
//            if (itFast.hasNext()) {
//                itFast.next();
//                slow = itSlow.next();
//            }
//        }
//        System.out.println("Middle element of the list is: " + slow);
        System.out.println("SECOND WAY: Middle element of the list is: " + middle(list));
    }

    public static Object middle(List<Object> list) {
        Iterator iter1 = list.iterator();
        Iterator iter2 = list.iterator();
        Object middl_item = null;
        for (boolean is_even = false; iter1.hasNext(); iter1.next()) {
            if (is_even) {
                middl_item = iter2.next();
            }
            is_even = (is_even) ? false : true;
        }
        return middl_item;
    }
    
}
