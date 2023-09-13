package ulohy.oop.enkapsulacia;

/*Úloha č. 1
        Vytvorte zoznam zamestnancov (DatabazaZamestnancov) v ktorej uložíme zamestnancov s údajmi ako je meno, priezvisko, pohlavie a rok narodenia. Využijeme princípy zapúzdrenia (encapsulation), čiže tvorba modelu a použitie getterov a setterov. Uloženie do dynamického poľa (čiže ArrayList-u) a následné vypísanie.*/


import java.util.ArrayList;

public class DatabazaZamestnancov {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec();

        zamestnanec1.setMeno("Jano");
        zamestnanec1.setPriezvisko("Horár");
        zamestnanec1.setPohlavie("muž");
        zamestnanec1.setRokNarodenia(1950);

        System.out.println("Vypíš detaily zamestnanca z databázy: ");
        System.out.println("Meno zamestnanca: " + zamestnanec1.getMeno());
        System.out.println("Priezvisko zamestnanca: " + zamestnanec1.getPriezvisko());
        System.out.println("Pohlavie zamestnanca: " + zamestnanec1.getPohlavie());
        System.out.println("Rok narodenia zamestnanca: " + zamestnanec1.getRokNarodenia());

        System.out.println();

        Zamestnanec zamestnanec2 = new Zamestnanec();

        zamestnanec2.setMeno("Anna");
        zamestnanec2.setPriezvisko("Mrkvičková");
        zamestnanec2.setPohlavie("žena");
        zamestnanec2.setRokNarodenia(1985);

        System.out.println("Vypíš detaily zamestnanca z databázy: ");
        System.out.println("Meno zamestnanca: " + zamestnanec2.getMeno());
        System.out.println("Priezvisko zamestnanca: " + zamestnanec2.getPriezvisko());
        System.out.println("Pohlavie zamestnanca: " + zamestnanec2.getPohlavie());
        System.out.println("Rok narodenia zamestnanca: " + zamestnanec2.getRokNarodenia());

        ArrayList<Zamestnanec> zamestnanci = new ArrayList<>();
        zamestnanci.add(zamestnanec1);
        zamestnanci.add(zamestnanec2);

        System.out.println();

        System.out.println("Vypisujem zoznam všetkých zamestnancov: ");
        for(Zamestnanec konkretnyzamestnanec:zamestnanci) {
            System.out.println();
            System.out.println("Meno zamestnanca: " + konkretnyzamestnanec.getMeno());
            System.out.println("Priezvisko zamestnanca: " + konkretnyzamestnanec.getPriezvisko());
            System.out.println("Pohlavie zamestnanca: " + konkretnyzamestnanec.getPohlavie());
            System.out.println("Rok narodenia zamestnanca: " + konkretnyzamestnanec.getRokNarodenia());
            System.out.println();
        }
    }
}
