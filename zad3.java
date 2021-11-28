package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = Math.abs(sc.nextInt());
        if(liczba / 1000 > 0) {
            System.out.println("Liczba "+liczba+" jest czterocyfrowa.");
        } else if(liczba / 100 > 0) {
            System.out.println("Liczba "+liczba+" jest trzycyfrowa.");
        } else if(liczba / 10 > 0) {
            System.out.println("Liczba "+liczba+" jest dwucyfrowa.");
        } else {
            System.out.println("Liczba "+liczba+" jest jednocyfrowa.");
        }
    }
}
