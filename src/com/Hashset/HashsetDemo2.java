package com.Hashset;

import java.util.HashSet;

public class HashsetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber=new HashSet<>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);

        System.out.println("Hashset "+evenNumber);

        HashSet<Integer> numbers=new HashSet<>();

        numbers.addAll(evenNumber);

        numbers.add(10);
        System.out.println("new hash set "+numbers);

        //remove all
        numbers.removeAll(evenNumber);
        System.out.println("removed "+numbers);


    }
}
