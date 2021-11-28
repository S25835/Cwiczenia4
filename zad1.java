package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Program służy do obliczenia pola figur:\n" +
                "\t1 – prostokąta\n" +
                "\t2 – kwadratu\n" +
                "\t3 – trójkąta\n" +
                "\t4 – rombu\n" +
                "\t5 – równoległoboku\n" +
                "\t6 – trapezu\n" +
                "Powiedz proszę, jaka figura Ciebie interesuje: ");
        int opcjaFigury = sc.nextInt();
        double pole = 0;
        switch (opcjaFigury) {
            case 1:
                pole = poleProstokatu();
                break;
            case 2:
                pole = poleKwadratu();
                break;
            case 3:
                pole = poleTrojkata();
                break;
            case 4:
                pole = poleRombu();
                break;
            case 5:
                pole = poleRownolegloboku();
                break;
            case 6:
                pole = poleTrapezu();
                break;
        }

        System.out.println("Pole jest równe: " + pole);
    }

    static double poleProstokatu() {
        System.out.print("Podaj długość a: ");
        double a = sc.nextDouble();
        System.out.print("Podaj długość b: ");
        double b = sc.nextDouble();
        return a*b;
    }
    static double poleKwadratu() {
        System.out.print("Podaj długość a: ");
        double a = sc.nextDouble();
        return a*a;
    }
    static double poleTrojkata() {
        System.out.print("Podaj długość a: ");
        double a = sc.nextDouble();
        System.out.print("Podaj długość h: ");
        double h = sc.nextDouble();
        return a*h*0.5;
    }
    static double poleRombu() {
        System.out.print("Podaj długość a: ");
        double a = sc.nextDouble();
        System.out.print("Podaj długość h: ");
        double h = sc.nextDouble();
        return a*h;
    }
    static double poleRownolegloboku() {
        System.out.print("Podaj długość a: ");
        double a = sc.nextDouble();
        System.out.print("Podaj długość h: ");
        double h = sc.nextDouble();
        return a*h;
    }
    static double poleTrapezu() {
        System.out.print("Podaj długość a: ");
        double a = sc.nextDouble();
        System.out.print("Podaj długość b: ");
        double b = sc.nextDouble();
        System.out.print("Podaj długość h: ");
        double h = sc.nextDouble();
        return (a+b) * h / 2;
    }
}
