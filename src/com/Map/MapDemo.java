package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> m=new HashMap();
//        HashMap m=new HashMap();
//
        m.put(1,"sumit");
        m.put(2,"amit");
        m.put(3,"sherya");
        m.put(4,"ankit");
        m.put(3,"X");


        System.out.println(m);

        System.out.println(m.get(2));

        m.remove(3);
        System.out.println(m);

        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue('A'));

        System.out.println(m.isEmpty());

        System.out.println(m.keySet());
        System.out.println(m.values());

        System.out.println(m.entrySet());
        System.out.println("=====================");


        for (Object i:m.keySet()){
            System.out.print(i+" - ");
        }
        System.out.println();

        for (Object j:m.values()){
            System.out.print(j+" - ");
        }
        System.out.println();

        for (Object k:m.entrySet()){
            System.out.println(k+" ");

        }


        System.out.println("-------------------");

        //Entry methods

        for (Map.Entry entry :m.entrySet()){

            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        System.out.println("======================");
        //iterator
        Set s=m.entrySet();
        Iterator itr= s.iterator();

        while (itr.hasNext()){
//            Map.Entry entry=(Map.Entry) itr.next();
//            System.out.println(entry.getKey()+" "+entry.getValue());
            System.out.println(itr.next());
        }

    }
}
