package ulohy.oop.enkapsulacia;

/*
Úloha č. 2:
        Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autor, rok vydania) cez konzolu kým nezadá slovo koniec. Tie na konci vypíšeme. Opakovanie na ArrayList.
        Menu s možnosťami
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Vymaž konkrétnu knihu (podľa indexu)
        Zobraz počet všetkých kníh
        Načítaj zoznam kníh zo súboru (zadaj názov súboru)
        Ulož zoznam kníh do súboru (zadaj názov súboru)
        Uprav knihu
        Vymaž všetky knihy
        Export do PDF
        Koniec = koniec aplikácie
*/

import ulohy.oop.enkapsulacia.Kniha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KniznicaMain {
    public static void main(String[] args) {

        ArrayList<Kniha> zoznamKnih = new ArrayList<>();


        Kniha kniha1 = new Kniha("Argentina", "Daniel", 1950);
        Kniha kniha2 = new Kniha("Jeruzalem", "Fero", 2000);
        Kniha kniha3 = new Kniha("Holandsko", "Liza", 1990);

        zoznamKnih.add(kniha1);
        zoznamKnih.add(kniha2);
        zoznamKnih.add(kniha3);


        while (true) {
            System.out.println("""
                    \nMenu s možnosťami:
                           1 Zadaj novú knihu
                           2 Zobraz všetky knihy
                           3 Zobraz konkrétnu knihu (podľa indexu)
                           4 Vymaž konkrétnu knihu (podľa indexu)
                           5 Zobraz počet všetkých kníh
                           6 Načítaj zoznam kníh zo súboru (zadaj názov súboru)
                           7 Ulož zoznam kníh do súboru (zadaj názov súboru)
                           8 Uprav knihu
                           9 Vymaž všetky knihy
                           10 Export do PDF
                           "Koniec" pre koniec aplikácie
                    """);
            System.out.println();
            Scanner s = new Scanner(System.in);

            String cislo = s.nextLine();
            try {
                if (cislo.equalsIgnoreCase("Koniec")) {
                System.out.println("Program ukončený."); break;
                }
                if (Integer.valueOf(cislo) == Integer.valueOf("1")) {
                    s.nextLine();
                    System.out.println("Zadaj názov: ");
                    String novaKnihaNazov = s.nextLine();

                    System.out.println("Zadaj autora: ");
                    String novaKnihaAutor = s.nextLine();

                    System.out.println("Zadaj rok vydania: ");
                    int novaKnihaRok = s.nextInt();

                    Kniha novaKniha = new Kniha(novaKnihaNazov, novaKnihaAutor, novaKnihaRok);
                    zoznamKnih.add(novaKniha);
                }

                if (Integer.valueOf(cislo) == Integer.valueOf("2")) {
                    System.out.println("Vypisujem zoznam všetkých kníh: ");
                    for (Kniha konkretnaKniha : zoznamKnih) {
                        System.out.println();
                        System.out.println("Názov knihy: " + konkretnaKniha.getNazov());
                        System.out.println("Autor knihy: " + konkretnaKniha.getAutor());
                        System.out.println("Rok vydania knihy: " + konkretnaKniha.getRokVydania());
                    }
                }

                if (Integer.valueOf(cislo) == Integer.valueOf("3")) {
                    System.out.println("Zadaj index požadovanej knihy: ");
                    int index = s.nextInt();
                    System.out.println("Zobrazujem konkrétnu knihu: ");
                    System.out.println(zoznamKnih.get(index - 1));
                }

                if (Integer.valueOf(cislo) == Integer.valueOf("4")) {
                    System.out.println("Zadaj index požadovanej knihy: ");
                    try {
                        int index = s.nextInt();
                        zoznamKnih.remove(index - 1);
                        System.out.println("Požadovaná kniha je vymazaná");
                    } catch (InputMismatchException e) {
                        System.out.println("Zadal si nesprávnu hodnotu.");
                    }
                }
                if (Integer.valueOf(cislo) == Integer.valueOf("5")) {
                    System.out.println("Počet všetkých kníh: " + zoznamKnih.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Zadal si nesprávny príkaz.");
            }
        }
    }
}