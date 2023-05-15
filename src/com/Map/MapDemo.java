package com.Map;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap m=new HashMap();

        m.put(1,"sumit");
        m.put(2,"amit");
        m.put(3,"sherya");
        m.put(4,"ankit");
        m.put(3,"X");

        m.put(5,'A');

        System.out.println(m);

        System.out.println(m.get(2));
        System.out.println(m.values());

        m.remove(3);
        System.out.println(m);

        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue('A'));


    }
}
