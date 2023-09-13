package ulohy.oop.enkapsulacia;

/*Úloha č. 1
        Vytvorte zoznam zamestnancov (DatabazaZamestnancov) v ktorej uložíme zamestnancov s údajmi ako je meno, priezvisko, pohlavie a rok narodenia. Využijeme princípy zapúzdrenia (encapsulation), čiže tvorba modelu a použitie getterov a setterov. Uloženie do dynamického poľa (čiže ArrayList-u) a následné vypísanie.*/


import java.util.ArrayList;

public class DatabazaZamestnancovSKonstruktormi {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec("Jano", "Horár", "muž", 1950);


        System.out.println("Vypíš detaily zamestnanca z databázy: ");
        System.out.println(zamestnanec1);

        System.out.println();

        Zamestnanec zamestnanec2 = new Zamestnanec("Anna", "Mrkvičková", "žena", 1985);

        System.out.println("Vypíš detaily zamestnanca z databázy: ");
        System.out.println(zamestnanec2);

        ArrayList<Zamestnanec> zamestnanci = new ArrayList<>();
        zamestnanci.add(zamestnanec1);
        zamestnanci.add(zamestnanec2);

        System.out.println();

        System.out.println("Vypisujem zoznam všetkých zamestnancov: ");
        for(Zamestnanec konkretnyzamestnanec:zamestnanci) {
            System.out.println(konkretnyzamestnanec);
            System.out.println();
        }
    }
}
