package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Come ti chiami?");
        String userName = input.nextLine();
        input.close();

        for(int i = 0; i < guestList.length; i++ ) {
            if (userName.equals(guestList[i])) {
                System.out.println("Sei nella lista, puoi entrare!");
                break;
            } else {
                System.out.println("Non sei nella lista, non puoi entrare!");
            }
        }
    }
}