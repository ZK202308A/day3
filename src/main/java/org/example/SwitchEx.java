package org.example;

import java.util.Random;

public class SwitchEx {

    public static void main(String[] args) {

        int num = 20;

        System.out.println("num = " + num);

        int oddNum  = num % 4; //0,1,2,3

        switch (oddNum) {
            case 0: //숫자와 char //문자열 //enum
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");

            case 2:
                System.out.println("2");

            case 3:
                System.out.println("3");
                break;
        }


    }//end main
}//end class
