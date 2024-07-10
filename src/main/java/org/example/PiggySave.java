package org.example;

public class PiggySave {

    //상태-기능들이 공유, 유지
    int balance;

    //입금 - 입력 -금액(int) , 반환 - void (Method)
    public void deposit(int amount) {
        System.out.println("DEBUG: deposit called");
    }



    //출금 - 입력 - () , 반환 - int
    public int withdraw() {
        System.out.println("DEBUG: withdraw called");
        return 0;
    }

}
