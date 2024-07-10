package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import lombok.Data;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        PiggySave ps = new PiggySave();
        Scanner sc = new Scanner(System.in);
        PiggySaveUI ui = new PiggySaveUI(sc, ps);

        ui.showMenus();


//        Player player = new Player(80,"King Author");
//
//        Monster monster = new Monster(3);
//
//        for(int i = 0; i < 3; i++){
//
//            int effect = player.attack();
//            System.out.println("Player attacked: " + effect);
//            System.out.println("MONSTER: " +monster.damage(effect));
//
//            if(monster.hp <= 0){
//                System.out.println("Monster dead! You WIN");
//                break;
//            }
//
//            int monsterEffect = monster.attack();
//            System.out.println("Monster attacked: " + monsterEffect);
//            System.out.println("PLAYER: " +player.defense(monsterEffect));
//
//
//        }//end for


//        PiggySave myPiggySave = new PiggySave();
//        PiggySave yourPiggySave = new PiggySave();




    }
}