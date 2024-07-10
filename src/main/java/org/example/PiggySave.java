package org.example;

public class PiggySave {

    //상태-기능들이 공유, 유지
    private int balance;


    //입금 - 입력 -금액(int) , 반환 - void (Method)
    public void deposit(int amount) {

        System.out.println("DEBUG: deposit called");

        if(amount <= 0){
            return;
        }

        this.balance += amount;
    }



    //출금 - 입력 - () , 반환 - int
    public int withdraw() {
        System.out.println("DEBUG: withdraw called");
        int currentBalance = this.balance;
        this.balance = 0;
        return currentBalance;
    }

}
