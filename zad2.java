package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = sc.nextInt();
        if (liczba % 2 == 0 || liczba % 3 == 0 || liczba % 5 == 0) {
            if(liczba % 2 == 0) {
                System.out.println("Liczba "+liczba+" jest podzielna przez 2.");
            }
            if(liczba % 3 == 0) {
                System.out.println("Liczba "+liczba+" jest podzielna przez 3.");
            }
            if(liczba % 5 == 0) {
                System.out.println("Liczba "+liczba+" jest podzielna przez 5.");
            }
        } else {
            System.out.println("Liczba "+liczba+" nie jest podzielna przez 2, 3 lub 5.");
        }
    }
}
