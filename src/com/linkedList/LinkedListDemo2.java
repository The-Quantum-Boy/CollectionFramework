package com.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList l1 =new LinkedList();

//		l1.add("M");
//		l1.add("N");
//		l1.add("O");
//		l.addAll(l1);

        l1.addAll(l);
        System.out.println(l1);

        l1.removeAll(l);
        System.out.println(l1);

        //sort
        Collections.sort(l);
        System.out.println("sorting "+l);

        //reverse sort
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("reverse "+l);

        //shuffle
        Collections.shuffle(l);
        System.out.println("shuffle "+l);
    }
}
