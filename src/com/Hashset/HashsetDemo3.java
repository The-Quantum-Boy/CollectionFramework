package com.Hashset;

import java.util.HashSet;

public class HashsetDemo3 {
    public static void main(String[] args) {

        //union, intersection , difference

        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);


        System.out.println("hash set 1 = "+set1);

        HashSet<Integer> set2=new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);
//		set2.add(6);

        System.out.println("hash set 1 = "+set2);

        //union -> remove duplicate keep unique

//		set1.addAll(set2);
//
//		System.out.println("Union -> "+set1);

        //intersection -> except set2 all will be retained
//		set1.retainAll(set2);
//		System.out.println("Intersection -> "+set1);

        //difference
//		set1.removeAll(set2);
//		System.out.println("difference -> "+set1);

        //subset
        set1.containsAll(set2);
        System.out.println("subset pf set1 -> "+set1);
        System.out.println(set1.containsAll(set2));

    }
}
