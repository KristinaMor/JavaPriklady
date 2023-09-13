package oop.enkapsulacia;

import java.util.ArrayList;

public class ZoznamKnih {
    public static void main(String[] args) {
        //Vytvorenie prvej knihy
        Kniha knihaJedna = new Kniha(); //vytvorili sme objekt (alebo inštanciu triedy) s nazvom knihaJedna
        knihaJedna.nazov = "Java";
        knihaJedna.autor = "Autor";
        knihaJedna.cena = 2.30;
        knihaJedna.rokVydania = 1999;

        //Ako vypisať obsah knihaJedna
        System.out.println("Názov knihy: " + knihaJedna.nazov);
        System.out.println("Autor knihy: " + knihaJedna.autor);
        System.out.println("Cena knihy: " + knihaJedna.cena);
        System.out.println("Rok vydania knihy: " + knihaJedna.rokVydania);

        System.out.println();

        //Vytvorenie druhej knihy
        Kniha kniha2 = new Kniha();
        kniha2.nazov = "Robot";
        kniha2.autor = "Isaac";

        System.out.println("Názov knihy: " + kniha2.nazov);
        System.out.println("Autor knihy: " + kniha2.autor);

        //Knihy ulozime do ArrayListu
        ArrayList<Kniha> knihy = new ArrayList<>();
        knihy.add(knihaJedna);
        knihy.add(kniha2);

        System.out.println();

        System.out.println("Vypisujem zoznam všetkých kníh: ");
        //Vypisanie obsahu knih
       // System.out.println(knihy); // vypise pre človeka nezrozumitelny text
        for(Kniha konkretnaKniha:knihy) {
          //  System.out.println(konkretnaKniha); vrati nezrozumitelny text
            System.out.println();
            System.out.println("Názov knihy: " + konkretnaKniha.nazov);
            System.out.println("Autor knihy: " + konkretnaKniha.autor);
            System.out.println("Cena knihy: " + konkretnaKniha.cena);
            System.out.println("Rok vydania knihy: " + konkretnaKniha.rokVydania);
            System.out.println();
        }
    }
}
