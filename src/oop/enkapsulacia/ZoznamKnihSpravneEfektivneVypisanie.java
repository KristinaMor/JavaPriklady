package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravneEfektivneVypisanie {
    public static void main(String[] args) {
        KnihaSpravne knihaJedna = new KnihaSpravne(); // vytvorili sme objekt (instanciu triedy) kniha
        knihaJedna.setNazov("Java");
        knihaJedna.setAutor("Jan");
        knihaJedna.setCena(2.30);
        knihaJedna.setRokVydania(2000);

        System.out.println("Vypíš detail knihy: ");
        System.out.println(knihaJedna);

        System.out.println();


        KnihaSpravne knihaDva = new KnihaSpravne();
        knihaDva.setNazov("Ja, robot");
        knihaDva.setAutor("Isaac");
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
