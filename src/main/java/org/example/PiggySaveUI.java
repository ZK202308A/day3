package org.example;

import java.util.Scanner;

public class PiggySaveUI {
    //공유
    private Scanner scanner;
    //협업자, 조력자
    private PiggySave piggySave;

    //생성자의 의미 - 로직을 수행하기 전에 준비하는 작업
    //생성자의 파라미터 - 협업자, 조력자의 리모컨을 전달

    public PiggySaveUI(Scanner scanner, PiggySave piggySave) {
        this.scanner = scanner;
        this.piggySave = piggySave;
    }

    private int scanInt(String msg) {
        System.out.println(msg);
        return scanner.nextInt();
    }

    //입금 UI 이름 depositInput 입력() 출력-void
    private void depositInput() {
        int amount = scanInt("Enter amount to deposit: ");
        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return;
        }
        piggySave.deposit(amount);
    }

    //출금 UI 이름 withdrawOut ( ) void
    private void withdrawInput() {
        int choice = scanInt("Enter amount to withdraw: YES 0 NO 1");

        if(choice == 0) {
            int current = piggySave.withdraw();
            System.out.println("CURRENT WITHDRAW: " + current);
            return;
        }
        System.out.println("See You later....");
    }

    //메뉴 기능 showMenus()  ( ) void
    public void showMenus() {
        outer:
        while(true) {
            String str = """
                    1.deposite
                    2.withdraw
                    3.exit
                    """;
            int oper = scanInt(str);
            switch (oper) {
                case 1:
                    depositInput();
                    break;
                case 2:
                    withdrawInput();
                    break;
                case 3:
                    this.scanner.close();
                    break outer;
            }
        }

    }

}
