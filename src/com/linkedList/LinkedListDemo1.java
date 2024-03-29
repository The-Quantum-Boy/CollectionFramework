package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        //declare
        LinkedList l=new LinkedList();

        l.add("sumit");
        l.add(123);
        l.add('A');
        l.add("ram");
        l.add(null);

        System.out.println(l);

        System.out.println(l.size());

        l.remove(3);

        System.out.println("after removing "+l);


        //adding element in middle

        l.add(3, "java");
        System.out.println("after add at index "+ l);

        l.set(0, "shyam");
        System.out.println("after setting value "+l);

        //contains

        System.out.println(" is contains -> "+l.contains("java"));
        System.out.println(" is empty -> "+l.isEmpty());

        //reading element
        System.out.println("--------------------");

        for(int i=0;i<l.size();i++) {
            System.out.print(l.get(i)+" ");
        }



        System.out.println();
        System.out.println("--------------------");
        for( Object e: l) {
            System.out.print(e+" ");
        }


        System.out.println();
        System.out.println("--------------------");
        Iterator it =l.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
