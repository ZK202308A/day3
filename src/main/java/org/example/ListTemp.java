package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ListTemp {

    public static void main(String[] args) {
//제네릭 - 내가 사용하는 타입은 Integer

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 45; i++) {


            list.add(1);
        }
        Collections.shuffle(list);

        System.out.println(list);
        System.out.println("size:" + list.size());

        System.out.println(list);

    }

}
