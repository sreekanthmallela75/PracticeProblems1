package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println("numbers" + list);
        System.out.println();
        ArrayListDemo1 demo1 = new ArrayListDemo1();
        demo1.filterPrime(list, list1);
    }

    public void filterPrime(ArrayList<Integer> list, ArrayList<Integer> list1) {

        for (int i = 1; i < list.size(); i++) {

            int count=0;
            for (int j = 2; j < i; j++){
                if (i%j==0){
                    count++;
                }
            }

            if (count==0){
                list1.add(i);
            }

        }
        System.out.println(list1);
    }
}




