package com.linkedList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        LinkedHashSet lset=new LinkedHashSet();

        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(2);
        lset.add(500);
        lset.add(600);

        System.out.println(lset);
    }
}
