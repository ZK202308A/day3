package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ListEx {

    public static void main(String[] args) {
        //제네릭 - 내가 사용하는 타입은 Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 45; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("size: " +list.size());

        //순서가 맨 앞
        int size = list.size();

        for (int i = 0; i < 6; i++) {
            System.out.println(list.remove(0));
        }




//        list.add(1, Integer.valueOf(100));
//
//        System.out.println(list);
//
//        list.set(2, Integer.valueOf(200));
//
//        System.out.println(list);
//
//        int idx = list.indexOf(Integer.valueOf(1000));
//        System.out.println(idx);

    }
}
