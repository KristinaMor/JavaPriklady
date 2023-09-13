package ulohy;

/*
Vytvorte dynamicke pole (prostredníctvom ArrayList), ktoré od používateľa bude žiadať zadanie číselných hodnôt - tie budeme do dynamického poľa pridávať. Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
        Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
        Pozn.: Zaokrúhľovanie na 2 desatinné miesta
        */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScitanieVstupnychHodnotCezArrayList {
    public static void main(String[] args) {


       /* ArrayList<Double> pridaneCisla = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napíšte číslo: ");
        Double cislo = null;


        while (true) {
            try {
                cislo = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Zadali ste zlý formát."); break;}
                if (cislo < 0) {
                    System.out.println(pridaneCisla);
                    break;
                } else {
                    pridaneCisla.add(cislo);
                }
                System.out.println("\nVypis všetkých Vami zadaných čisel: ");
                for (Double konkretneCisla : pridaneCisla)
                    System.out.println(konkretneCisla);

        }
    }
}*/
       double cislo = 0;
        ArrayList<Double> pridaneCisla = new ArrayList<>();

        while (cislo >= 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Napíšte číslo: ");
            try {
                cislo = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Zadaný nesprávny formát");
            }
            pridaneCisla.add(cislo);
        }

            System.out.println("\nVypis vsetkych vami zadanych cisel: ");
            for (Double konkretneCisla : pridaneCisla)
                System.out.println(konkretneCisla);
            }
        }

