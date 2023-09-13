package ulohy;
/*
Úloha č.1: Príklad na prácu s premennými
        Vypíšte do konzoly nasledujúci text:
        Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
        V Bratislave dňa 18.06.2022
        Poznámka: Dátum narodenia, známku a rok + aktuálny dátum nastavte tak, aby sa dali meniť v zdrojovom kóde (t.j. cez premenné).
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PremenneUloha {
    public static void main(String[] args) {

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_CYAN = "\u001B[36m";

        String meno = "Jozef";
        String priezvisko = "Mrkvička";
        String celeMeno = meno + " " + priezvisko;


        LocalDate datumNarodenia = LocalDate.of(2000, 04, 03);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        String naformatovyDatum = datumNarodenia.format(dtf);


        float znamka = 1.5f;
        int rok = 2002;

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        String datum = date.format(formatter);


        System.out.println(ANSI_RED + "Študent " + celeMeno + " sa narodil " + naformatovyDatum + ANSI_RESET + ANSI_BLACK + " z maturitnej skúšky má známku " + znamka + ANSI_RESET + ANSI_BLUE + " a od septembra " + rok +" nastúpi do nového zamestnania ako Java programátor." + ANSI_RESET + ANSI_CYAN + "\nV Bratislave dňa " + datum + ANSI_RESET);
    }
}
