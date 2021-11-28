package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca: ");
        int liczba = sc.nextInt();
        switch (liczba) {
            case 1:
                System.out.println("Wspomniałeś styczeń.");
                break;
            case 2:
                System.out.println("Wspomniałeś luty.");
                break;
            case 3:
                System.out.println("Wspomniałeś marzec.");
                break;
            case 4:
                System.out.println("Wspomniałeś kwiecień.");
                break;
            case 5:
                System.out.println("Wspomniałeś maj.");
                break;
            case 6:
                System.out.println("Wspomniałeś czerwiec.");
                break;
            case 7:
                System.out.println("Wspomniałeś lipiec.");
                break;
            case 8:
                System.out.println("Wspomniałeś sierpień.");
                break;
            case 9:
                System.out.println("Wspomniałeś wrzesień.");
                break;
            case 10:
                System.out.println("Wspomniałeś październik.");
                break;
            case 11:
                System.out.println("Wspomniałeś listopad.");
                break;
            case 12:
                System.out.println("Wspomniałeś grudzień.");
                break;
        }
    }
}
