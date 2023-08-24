package Úlohy;

 /*Popis z pohladu pouzivatela: Program vyzve pouzivatela na ciselny vstup, t. k. pocet bodov, ktore po odobreni vyhodnoti a vypise zodpovedajucu znamku podla kriterii. Nasledne sa program ukonci. Program bude fungovat do nekonecna, kym nezadame vstupnu hodnotu -1*/

//TODO doplnit nekonecne opakovanie programu

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriradenieZnamky {
    public static void main(String[] args) {
        int pocetBodov = 0; // inicializuje premennu PocetBodov na tomto mieste, aby sme ju mali platnu v celom bloku
        // while (true) { // while reprezentuje cyklus s podmienkou na zaciatku, dá sa použiť aj for (;;) miesto while (true)
        Scanner skener = new Scanner(System.in);

       // while (pocetBodov >=0){ //korektne programovanie vyzaduje zadanie spravnej podmienky hned na zaciatku while
        while (pocetBodov != -1) { //toto znamena nerovna sa, ak sa pocetBodov nerovna -1, pokracujeme dalej
            System.out.println("Zadaj počet bodov: ");


            try {
                pocetBodov = skener.nextInt(); // realny vstup od pouzivatela
                if (pocetBodov > 90 && pocetBodov <= 100)
                {System.out.println("Tvoja známka je A");} // zloženou zatvorkou priradime text k jednemu celku
                    // System.out.println("Si extra šikovný"); toto by bolo inak brane ako samostatny celok}
                else if (pocetBodov > 75 && pocetBodov < 90 && pocetBodov <= 100) System.out.println("Tvoja známka je B");
                else if (pocetBodov > 65 && pocetBodov < 75) System.out.println("Tvoja známka je C"); // vyraz && = AND
                // Ukazka ako funguje logicky vyraz ALEBO (OR): if (vyraz1 || vyrat 2) odpoved
           /* else if (pocetBodov == -1) System.exit(1); možné ukončenie cyklu
            else if (pocetBodov < 0) System.exit(1)
            else if (pocetBodov == -1) break; // korektná cesta ako ukončiť cyklus*/
                else System.out.println("Počtu bodov nezodpovedá žiadna známka");

            } catch (InputMismatchException e) {
                System.out.println("Prepáč, zadal si nesprávny formát čísla");
            }
        }
        skener.close();
    }
}
