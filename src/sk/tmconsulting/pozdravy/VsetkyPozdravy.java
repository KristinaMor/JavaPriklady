package sk.tmconsulting.pozdravy;

/*
TODO Uloha č. 1: vytvorenie metod a ich volanie z centralnej triedy
 Vo všetkých balíčkoch okrem sk.. vytvorte triedu ktora sa bude volať Ahoj, Szia, Hallo, Hello. Každá trieda bude mať statickú metodu s nazvom pozdravujem (). Dana metoda bude do konzoly vypisovať pozdrav v prislusnom jazyku.
*/


import sk.tmconsulting.pozdravy.anglicky.Hello;
import sk.tmconsulting.pozdravy.madarsky.Szia;
import sk.tmconsulting.pozdravy.nemecky.Hallo;
import sk.tmconsulting.pozdravy.slovensky.Ahoj;

public class VsetkyPozdravy {
    public static void main(String[] args) {
        Hello.pozdravujem();
        Szia.pozdravujem();
        Ahoj.pozdravujem();
        Hallo.pozdravujem();

        System.out.println(); //prázdny riadok

        // Dynamicke volanie metod
        // Ak chceme volať nestatické metody, musime najprv vytvorit objekt alebo inštanciu triedy
        Hello helloObjekt = new Hello(); //vytvorenie objektu, inštancii triedy Hello
        helloObjekt.pozdravujemDynamicky();

        Szia sziaObjekt = new Szia();
        sziaObjekt.pozdravujemDynamicky();

        Hallo halloObjekt = new Hallo();
        halloObjekt.pozdravujemDynamicky();

        Ahoj ahojObjekt = new Ahoj();
        ahojObjekt.pozdravujemDynamicky();
    }
}
