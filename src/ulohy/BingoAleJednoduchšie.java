package ulohy;

import java.util.Random;
import java.util.Scanner;

        public class BingoAleJednoduchšie {
            public static void main(String[] args) {

                Scanner scn = new Scanner(System.in); // Inicializacia skeneru, resp. konzoly pre pouzivatelsky vstup. System.in je vlastne ""
                Random r = new Random();

                int maximalnaHodnota = 10;
                int minimalnaHodnota = 1;
                int nahodneCisloGenerovaneJavou  = r.nextInt(maximalnaHodnota - minimalnaHodnota + 1) + minimalnaHodnota;

                System.out.println("CHEAT: Vygeneroval som takéto náhodné číslo " + nahodneCisloGenerovaneJavou);

                //System.out.println("Zadaj číslo od 1 do 10. Následne ho potvrď klávesom ENTER.");
                //int zadaneCisloPouzivatelom = scn.nextInt(); // Priamo v konzole zobrazi, resp. pozaduje zadanie cisla

                // ZACIATOK OPAKOVANIA
                //int zadaneCisloPouzivatelom = 0;
                //while (nahodneCisloGenerovaneJavou != zadaneCisloPouzivatelom) {
                while (true) {
                    //for (;;) { // Identicke ako while(true)
                    System.out.println("Zadaj číslo od 1 do 10. Následne ho potvrď klávesom ENTER.");
                    int zadaneCisloPouzivatelom = scn.nextInt(); // Priamo v konzole zobrazi, resp. pozaduje zadanie cisla
                    if (nahodneCisloGenerovaneJavou == zadaneCisloPouzivatelom) {
                        System.out.println("Áno, uhadol si!");
                        break; // Prikazom break prerusime cyklus while (true)
                    } else if (nahodneCisloGenerovaneJavou > zadaneCisloPouzivatelom) {
                        System.out.println("Nie, neuhádol si, moje vygenerované číslo bolo väčšie!");
                    } else {
                        System.out.println("Nie, neuhádol si, moje vygenerované číslo bolo menšie!");
                    }
                }

                // KONIEC OPAKOVANIA

            }
        }
