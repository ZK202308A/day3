package org.example;

import java.util.Random;
import java.util.Scanner;

public class RSPGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("0,1,2중에 하나를 입력하세요");

        //사용자의 입력 - 변수
        int user = scanner.nextInt();
        System.out.println("USER: " + user);

        Random random = new Random();
        int com = random.nextInt(3); //0,1,2
        System.out.println("COM: " + com);

        if(com == user){
            System.out.println("비김");
            return;
        }

        //만일 컴의 값이 사용자의 값보다 작다면 컴값에 3을 더한다.
//        if(com < user){
//            com = com + 3;
//        }
        com = com < user ? com +3 :com;

        //if 제어문(Statement) 결과가 없어도 된다.
        // 삼항연산자 - 반드시 변수를 만들어서 값을 담아야만 한다.


        //결과차이
        int result = com - user;
        //2면 user승 1 user 패 0이면 비김
        if(result == 2){
            System.out.println("USER WIN");
        }else if(result == 1){
            System.out.println("USER DEFEAT");
        }//

    }
}
