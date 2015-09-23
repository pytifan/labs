/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void basicTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add(0, "B");
        list.add(1, "C");
        list.add(2, "D");
        list.add(0, "A");

        assertEquals(list.indexOf("A"), 0);

        list.remove(0);
        assertEquals(list.get(0), "B");
        assertEquals(list.size(), 3);
        assertEquals(list.indexOf("C"), 1);

        String removed = list.remove(1);
        if (removed!=null) {
        assertTrue("C".equals(removed));
        }
        list.add(1, "E");
        assertEquals(list.size(), 3);
        assertNotNull(list.get(1));
        assertTrue(list.get(1).equals("E"));

        list.set(1, "F");
        assertNotNull(list.get(1));
        assertTrue(list.get(1).equals("F"));

        list.add(0, "G");
        assertTrue(list.equals(Arrays.asList("G", "B", "F", "D")));
        assertFalse(list.equals(Arrays.asList("G", "B", "F", "D", "E")));
        assertFalse(list.equals(Arrays.asList("B", "F", "E")));

        assertEquals(4, list.size());

        ArrayList<String> copy = new ArrayList<>(Arrays.asList("G", "B", "F", "D"));
        int i = 0;
        for (String item : list) {
            assertEquals(item, copy.get(i++));
        }

        int j = 0;
        ListIterator<String> iterator = list.listIterator();
        while (j < list.size()) {
            iterator.next();
            j++;
        }

        while (iterator.hasPrevious()) {
            String s = iterator.previous();
            assertEquals(s, copy.get(--j));
        }

        iterator = list.listIterator();
        assertEquals(iterator.next(), "G");
        assertEquals(iterator.next(), "B");
        assertEquals(iterator.previous(), "B");
        assertEquals(iterator.previous(), "G");
        assertEquals(iterator.next(), "G");

        iterator = list.listIterator();
        iterator.add("M");
        assertEquals(list, Arrays.asList("M", "G", "B", "F", "D"));

        assertEquals(iterator.next(), "G");
        iterator.add("N");
        assertEquals(list, Arrays.asList("M", "G", "N", "B", "F", "D"));

        iterator = list.listIterator();
        iterator.next();
        //assertEquals(iterator.next(), "D");

        //iterator.toStart();
//        assertEquals(iterator.next(), "M");
    }
    
    

    @Test
    public void sortTest1() {
        LinkedList<String> linkedList = new LinkedList();
                
        linkedList.add("N");
        linkedList.add("P");
        linkedList.add("d");
        linkedList.add("A");
        linkedList.add("z");
        Collections.sort(linkedList,new MyComp());
        assertEquals(Arrays.asList("A", "d", "N", "P", "z"), linkedList);
    }

    @Test
    public void sortTest2() {
        LinkedList<String> linkedList = new LinkedList();

        linkedList.add("N");
        linkedList.add("P");
        linkedList.add("d");
        linkedList.add("A");
        linkedList.add("z");
        
        Collections.sort(linkedList,new MyComp());
        assertEquals(linkedList, Arrays.asList("A", "d", "N", "P", "z"));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void simpleConcurrentModificationTest() {
        LinkedList<String> linkedList = new LinkedList(Arrays.asList("a", "b", "c", "d", "e"));
        Iterator<String> iterator = linkedList.iterator();
        //linkedList.remove(0, 1);
        linkedList.remove(0);
        iterator.next();
    }

    @Test(expected = ConcurrentModificationException.class)
    public void advancedConcurrentModificationTest() {
        LinkedList<String> linkedList = new LinkedList(Arrays.asList("a", "b", "c", "d", "e"));

        ListIterator<String> iterator1 = linkedList.listIterator();
        ListIterator<String> iterator2 = linkedList.listIterator();

        iterator1.next();
        iterator2.next();

        iterator1.set("a1");
        iterator2.next();
    }
}
class MyComp implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
}
        