package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnihSpravne {
    public static void main(String[] args) {
        KnihaSpravne knihaJedna = new KnihaSpravne(); // vytvorili sme objekt (instanciu triedy) kniha
        knihaJedna.setNazov("Java");
        knihaJedna.setAutor("Jan");
        knihaJedna.setCena(2.30);
        knihaJedna.setRokVydania(2000);

        System.out.println("Vypíš detail knihy: ");
        System.out.println("Názov knihy: " + knihaJedna.getNazov());
        System.out.println("Autor knihy: " + knihaJedna.getAutor());
        System.out.println("Cena knihy: " + knihaJedna.getCena());
        System.out.println("Rok vydania knihy: " + knihaJedna.getRokVydania());

        System.out.println();


        KnihaSpravne knihaDva = new KnihaSpravne();
        knihaDva.setNazov("Ja, robot");
        knihaDva.setAutor("Isaac");
        System.out.println("Vypíš detail knihy: ");
        System.out.println("Názov knihy: " + knihaDva.getNazov());
        System.out.println("Autor knihy: " + knihaDva.getAutor());

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
            System.out.println("Názov knihy: " + konkretnaKniha.getNazov());
            System.out.println("Autor knihy: " + konkretnaKniha.getAutor());
            System.out.println("Cena knihy: " + konkretnaKniha.getCena());
            System.out.println("Rok vydania knihy: " + konkretnaKniha.getRokVydania());
            System.out.println();
        }


    }
}
