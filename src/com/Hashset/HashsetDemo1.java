package com.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo1 {
    public static void main(String[] args) {
        //default capacity = 16 and Load Factor=0.75
        //HashSet hs=new HashSet();


        //initial capacity = 100 and Load factor =0.90-> 90%
        //HashSet hs=new HashSet(100,(float)0.90);

//		HashSet<Integer> hs=new HashSet<>();

        HashSet hs=new HashSet();

        //add object or element

        hs.add(100);
        hs.add("123");
        hs.add("welocome");
        hs.add(12.0);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        System.out.println(hs);


        hs.remove(12.0);
        System.out.println("after removing "+hs);

        //can not modify value

        System.out.println("contains "+hs.contains(1000));

        System.out.println("is empty "+hs.isEmpty());



        //reading element from hashset

        for(Object e:hs) {
            System.out.print(e+" ");
        }

        System.out.println();
        Iterator it =hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
