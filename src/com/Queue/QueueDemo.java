package com.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();

        //adding elements add() offer()

        q.add("A");
        q.add("B");
        q.add("C");
//        q.offer(100); // not allowed in queue beacause hetrogeneous

        System.out.println(q);

        //get head
//        System.out.println(q.element()); //returns head elemet, if empty returns NOsuchElement Exception
//        System.out.println(q.peek()); //returns head elements if empty returns null

        //return and remove element remove() poll()

//        System.out.println(q.remove()); //if queue empty returns NoSuchElementException
//        System.out.println(q);
//
//        System.out.println(q.poll());
//        System.out.println(q);


        Iterator itr=q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        for (Object e:q){
            System.out.print(e+" ");
        }




    }
}
