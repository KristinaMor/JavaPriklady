package ulohy;

// TODO Vytvorte metody obdobnym sposobom aj pre odcitanie, nasobenie, delenie a modulo

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZaklMatOpCezMetodyKonzolovyVstup {
   public static double scitanie(double cislo1, double cislo2) {
       double sucet = cislo1 + cislo2;
       return sucet;
      // return cislo1 + cislo2;
   }

   public static double odcitanie(double cislo1, double cislo2) {
       return cislo1 - cislo2;
   }

    public static double nasobenie(double cislo1, double cislo2) {
       return cislo1 * cislo2;
    }

    public static double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    public static double modulo(double cislo1, double cislo2) {
        return cislo1 % cislo2;
    }

    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok) {
        System.out.printf("%10s %s %.1f a %.1f je: %.1f%n","", operacia, cislo1, cislo2, vysledok); //na odsadenie o 10, trebalo pridat dalsi argument, resp. prazdny text, ktory je reprezentovany
    }

    public static void main(String[] args) {
        double cislo1 = 0, cislo2 = 0;

        //Konzolovy vstup od použivatela
        Scanner skener = new Scanner(System.in); // inicializovali sme konzlovy skener na vstup z klavesnice

        //TODO ako eliminovať chybu ak zadame desatinne čislo s bodkov miesto ciarky, reakcia na chybu bude: Zadal si chybu a program skonči

        System.out.println("Zadaj prvé číslo: ");
        try {
            cislo1 = skener.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Zadal si neakceptovatelny formát čísla");
            System.exit(1); //násilne ukoncenie programu
        }finally { // bez ohladu na chybu sa skener uzavre
           //skener.close();
        }

        System.out.println("Zadaj druhé číslo: ");
        cislo2 = skener.nextDouble();

        //Vypis vysledkov matematickych operacii volanim metody vypis
        vypis("Súčet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Násobenie", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Podiel", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo", cislo1, cislo2, modulo(cislo1, cislo2));
    }
}
