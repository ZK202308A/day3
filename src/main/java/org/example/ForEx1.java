package org.example;

import java.util.Arrays;

public class ForEx1 {


    public static void main(String[] args) {

        //배열 - 타입 []
        LottoBall[] balls = new LottoBall[45];

        //0,1,2,3,.... 44
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new LottoBall(i + 1);
        }

        System.out.println(Arrays.toString(balls));




//        int[] arr = new int[45]; //45
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(arr));

    }

}//end class
