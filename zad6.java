package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        double liczba = sc.nextDouble();
        int znak = znakLiczby(liczba);

        System.out.println("Wartość funkcji signum dla "+liczba+" to " + znak);
    }

    static int znakLiczby(double d) {
        int wynik = 0;
        if (d > 0) {
            wynik = 1;
        } else {
            wynik = -1;
        }
        return wynik;
    }
}
