package Úlohy;

import java.util.Random;
import java.util.Scanner;

/*
Úloha č.1
        Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10. Používateľ musí uhádnuť číslo. Ak uhádne menšie, tak mu Java vypíše Neuhádol si, moje číslo je väčšie, analogicky Neuhádol si, moje číslo je menšie a pri úspešnom uhádnutí BINGO! Uhádol si!
        Bonusová úloha:
        Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.
*/
public class Bingo {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Vlož svoje meno: ");

        String pouzivatelskeMeno = myObj.nextLine();
        System.out.println("Vitaj pri hre Bingo, " + pouzivatelskeMeno + "!");

        int náhodnéCislo = vyhodRandomCislo(1, 100);
        int cislo = getGuess();

        while (cislo != náhodnéCislo) {
            if (náhodnéCislo > cislo)
                System.out.println("Neuhádol si, moje číslo je väčšie. Skús to znovu.");
            if (náhodnéCislo < cislo)
                System.out.println("Neuhádol si, moje číslo je menšie. Skús to znovu.");
            cislo = getGuess();
        }

        System.out.println("BINGO!");
    }


            private static int vyhodRandomCislo ( int from, int to){
                Random r = new Random();
                return r.nextInt(to - from + 1) + from;
            }
            private static int getGuess () {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hádaj číslo: ");
                int cislo = sc.nextInt();
                return cislo;
            }
        }
