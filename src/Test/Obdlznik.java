package Test;

/*
Úloha č. 2
        Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na výpočet jeho obsahu (vypocitajObsah).
        Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí, ináč beží do “nekonečna”.
        Program po spustení zobrazí menu položky, ktoré môžu vyzerať nasledovne:
        Vítam Ťa v programe na výpočet obvodu a obsahu obdĺžnika. Zadaj jednu s nasledujúcich možností:
        (s)tart = pre zadanie strán a, b a následný výpočet obsahu / obvodu
        (q)uit = ukončenie programu
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Obdlznik {
    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }
    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        double a = 2.5; // Strana a
        double b = 3.5; // Strana b
        // TODO Vytvorit menu polozky s(tart) pre vstupne zadavanie stran a, b a prikaz q pre ukoncenie programu. Inac program bude fungovat do nekonecna
        System.out.println("Obvod obdĺžnika je: " + vypocitajObvod(a, b));
        System.out.println("Obsah obdĺžnika je: " + vypocitajObsah(a, b));
    }

    @Test
    public void testVypocitajObvod() {
        assertEquals(10, vypocitajObvod(2,3));
        assertEquals(12, vypocitajObvod(2.5,3.5));
    }

    @Test
    public void testVypocitajObsah() {
        assertEquals(20, vypocitajObsah(2, 10));
        assertEquals(8, vypocitajObsah(2, 4));
    }
}