package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravneEfektivneVypisanieAKonstruktory {
    public static void main(String[] args) {
        KnihaSpravne knihaJedna = new KnihaSpravne("Java", "Ján", 2000, 3.99); // vytvorili sme objekt (instanciu triedy) kniha


        System.out.println("Vypíš detail knihy: ");
        System.out.println(knihaJedna);

        System.out.println();


        KnihaSpravne knihaDva = new KnihaSpravne("Ja, robot", "Isaac", 1960, 2.98);

        System.out.println("Vypíš detail knihy: ");
        System.out.println(knihaDva);

        //Knihy ulozime do ArrayListu
        ArrayList<KnihaSpravne> knihy = new ArrayList<>();
        knihy.add(knihaJedna);
        knihy.add(knihaDva);

        System.out.println();

        System.out.println("Vypisujem zoznam všetkých kníh: ");
        //Vypisanie obsahu knih
        // System.out.println(knihy); // vypise pre človeka nezrozumitelny text
        for(KnihaSpravne konkretnaKniha:knihy) {
            //  System.out.println(konkretnaKniha); vrati nezrozumitelny text
            System.out.println();
            System.out.println(konkretnaKniha);
        }
    }
}
