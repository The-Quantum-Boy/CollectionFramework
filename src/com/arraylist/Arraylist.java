package com.arraylist;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        //declare arraylist

        ArrayList al=new ArrayList<>();

        al.add(100);
        al.add("sumit");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println("ArrayList "+ al);

        //methods
        System.out.println(al.size());

        al.remove(1);

        System.out.println("after removing"+al);

        al.add(2,"python");

        System.out.println("after add at index "+al);

        System.out.println("get number "+al.get(3));

        al.set(0,"sumit");
        System.out.println("after replacing "+al);

        System.out.println("contains "+al.contains("sumit"));
        System.out.println("contains "+al.contains("sumidt"));

        System.out.println("is empty "+al.isEmpty());


        //reads data form ArrayList
        //for loop

        System.out.println("read using for loop........... ");
        for (int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        //forEach
        System.out.println("read using for each loop........... ");

        for (Object e:al){
            System.out.println(e);
        }

        //Iterator

        System.out.println("read using itearator........... ");


        Iterator it=al.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //other methods
        al.addAll(List.of("amit",23,"hello",34,4));
        System.out.println("add all "+al);


        ArrayList al2=new ArrayList();
        al2.add("x");
        al2.add("y");
        al2.add("asdf");
        al2.add("sdf");

        al.add(al2);
        System.out.println("add all "+al);

        System.out.println(al);
        al.removeAll(al2);
        System.out.println("after removing al2 form al "+al);


        //sort

        List list=List.of(23,3445,56,65,322,12,3);

        ArrayList arrayList=new ArrayList<>();
        arrayList.add('x');
        arrayList.add('y');
        arrayList.add('a');
        arrayList.add('c');
        arrayList.add('n');
        System.out.println("list "+arrayList);
        Collections.sort(arrayList);
        System.out.println("sorted list "+arrayList);

        //reverse sorting
        Collections.sort(arrayList,Collections.reverseOrder());

        System.out.println("reverse sorted list "+arrayList);


        //shuffle
        Collections.shuffle(arrayList);
        System.out.println("after shuffling"+arrayList);


        String arr[]={"ado","dsf","sdf","sdf"};

        System.out.println("This is array "+Arrays.toString(arr));

        ArrayList arrayList1 =new ArrayList(Arrays.asList(arr));
        System.out.println("array int ArrayList "+arrayList1);





    }
}
