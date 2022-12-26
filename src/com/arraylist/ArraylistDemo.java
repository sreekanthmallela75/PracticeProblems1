package com.arraylist;

import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.print("numbers" + list);
        System.out.println();
        ArraylistDemo demo =new ArraylistDemo();
        demo.filterEven(list , list1);
      //  System.out.println();
    }

    public void filterEven(ArrayList<Integer>list,ArrayList<Integer>list1) {
        for (int i = 1; i <list.size(); i++){
            if (i%2==0){
                list1.add(i);
            }
        }
        System.out.println(" even numbers " + list1);
    }
}
