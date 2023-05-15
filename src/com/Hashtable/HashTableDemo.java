package com.Hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {

        //capacity = 11 , load factor = 0.75
        //we can give initial capacity
        //we can also give load factor

        Hashtable<Integer, String> t=new Hashtable();


        t.put(101,"sumit");
        t.put(102,"amit");
        t.put(103,"shubham");
//        t.put(null,"X");
//        t.put(104,null);

        System.out.println(t);

        System.out.println(t.get(102));

        System.out.println(t.containsKey(102));

        System.out.println(t.containsValue("sumit"));

        System.out.println(t.isEmpty());

        System.out.println(t.keySet());

        System.out.println(t.values());

        System.out.println("======================");

        for (int k:t.keySet()){
            System.out.println(k+" -> "+t.get(k));
        }
        System.out.println("======================");
        //entry specific methods
        for (Map.Entry e:t.entrySet()){
            System.out.println(e.getKey()+" ---> "+e.getValue());
        }

        Set s=t.entrySet();

        Iterator it =s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
