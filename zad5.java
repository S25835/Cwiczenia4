package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca: ");
        int liczba = sc.nextInt();
        String tresc = "Do końca roku czekają Cię jeszcze miesiące: ";
        switch (liczba) {
            case 12:
                System.out.println("Hura, to już koniec roku.");
                break;
            case 1:
                tresc += "styczeń, ";
            case 2:
                tresc += "luty, ";
            case 3:
                tresc += "marzec, ";
            case 4:
                tresc += "kwiecień, ";
            case 5:
                tresc += "maj, ";
            case 6:
                tresc += "czerwiec, ";
            case 7:
                tresc += "lipiec, ";
            case 8:
                tresc += "sierpień, ";
            case 9:
                tresc += "wrzesień, ";
            case 10:
                tresc += "październik, ";
            case 11:
                tresc += "listopad, grudzień.";
                System.out.println(tresc);
                break;
        }

    }
}