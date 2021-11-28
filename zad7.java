package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        int a = sc.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = sc.nextInt();
        System.out.print("Podaj liczbę n: ");
        int n = sc.nextInt();

        if(a % n == b % n) {
            System.out.println("Liczby "+a+" i "+b+" przystają do siebie modulo "+n+".");
        } else {
            System.out.println("Liczby "+a+" i "+b+" nie przystają do siebie modulo "+n+".");
        }
    }
}
