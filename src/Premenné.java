import java.text.SimpleDateFormat;
import java.util.Date;

public class Premenné {
    public static void main(String[] args) {
        boolean jeJavaLahka = true;

        String menoZamestnanca = "Ján";
        String priezvisko = "Žitniak";
        String celeMeno = menoZamestnanca + " " + priezvisko; // spajame obsah premennych a vlastneho textu

        //System.out.println(menoZamestnanca + " " + priezvisko + " je zamestnancom TM Consulting.");
        System.out.println(celeMeno + " je zamestnancom TM Consulting.");

        int mojeCislo = 15;
        int mojeCisloVynasobene2mi = mojeCislo * 2;

        System.out.println("Pôvodne číslo je: " + mojeCislo);//premenovanie nazvu premmenj v celom projekte cez prave tlačidlo, Refactor, Rename
        System.out.println("Pôvodne číslo vynásobené 2x: " + mojeCisloVynasobene2mi);

        int mojeCislo2;
        mojeCislo2 = 15;
        System.out.println(mojeCislo2);

        int mojeCislo3 = 15;
        mojeCislo3 = 20; //trz je to cislo 20, prepisalo to 15
        System.out.println(mojeCislo3);

        final int konštanta = 15;
        //konštanta = 20; vygeneruje error, nedá sa prepísať finalna premenná

        int myNum = 5;
        float myFloatNum = 5.99f; // deklarujem desatinne cislo, na konci musi byt uvedene f
        double myDoubleNum = 5.99; //deklarujem desatinne cislo, je 2x vacsie ako float, nemusi sa uvadzat f, až do 15 desatinnych miest
        char myLetter = 'a'; // držia len jeden charakter, pouzivaju sa znaky z ASCII table, ked napr. nevieme najst znak na klavesnici, tak maju priradene cisla
        boolean myBool = true; // pravda alebo nepravda
        String myText = "Hello";
        byte cisloTypuByte = 127; //čísla typu byte maju hodnoty od -128 do 127, iné sú error

        int x = 5;
        int y = 6;
        int sum = x +y;
        System.out.println(sum); // printne hodnotu x+y

        int x2 = 5, y2 = 6, z = 50;
        System.out.println(x2 + y2 + z); // nazvy premennych nemozu zacinat cislom

        System.out.printf("Je Java lahky programovaci jazyk: " + jeJavaLahka);





    }
}
