package ulohy;

/*Vytvorte pole s ľubovoľným počtom čísel (napr. 5-tich), ktorými budeme prechádzať a jednotlivé hodnoty sčítavať, čiže výsledkom bude celkový súčet hodnôt.
        Bonusová úloha: Vytvorte metódu (napr. s názvom scitaj() resp. v angličtine getSum()), ktorá bude vracať výsledok po sčítaní.
        Bonusová úloha č. 2 (samostatne riešená): Vytvorte metódu priemeruj(), ktorá vypočíta priemer z daných čísiel.
        Bonusové úlohy naviac: Vytvorte metódu pocet(), ktorá zistí počet čísel v poli. Zároveň by tam mohla metóda, ktorá zisti najväčšie číslo v poli max(). Analogicky aj metódu min(), ktorá zisti najmenšie číslo v poli.*/


import java.util.Arrays;

public class ZakladneExcelFunkcie {

    public static void main(String[] args) {
        double[] cisla = {10, 20, 30, 40, 50}; // Vytvorenie a naplnenie pola s desatinnymi cislami

        double sum = scitaj(cisla);
        System.out.println("Výsledok sčítania hodnôt v poli je: " + sum);

        double priemer = priemeruj(cisla);
        System.out.println("Výsledok priemerovania hodnôt v poli je: " + priemer);

        double priemerEfektivne = priemerujEfektivne(cisla);
        System.out.println("Výsledok EFEKTIVNÉHO priemerovania hodnôt v poli je: " + priemerEfektivne);

        double pocetHodnot = pocet(cisla);
        System.out.println("Počet vstupných hodnôt je: " + pocetHodnot);

        double najvyššiaHodnota = max(cisla);
        System.out.println("Najvyššia vstupná hodnota je: " + najvyššiaHodnota);

        double najnižšiaHodnota = min(cisla);
        System.out.println("Najnižšia vstupná hodnota je: " + najnižšiaHodnota);

    }

    // Metoda na scitanie hodnot v poli
    private static double scitaj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum;
    }

    // Metoda na priemerovanie hodnot v poli
    private static double priemeruj(double[] cisla) {
        double sum = 0;
        for (int i = 0; i < cisla.length; i++) {
            //sum = sum + cisla[i];
            sum += cisla[i]; // Identicky vyznam ako riadok vyssie
        }
        return sum / cisla.length;
    }

    // Metoda na priemerovanie hodnot v poli
    private static double priemerujEfektivne(double[] cisla) {
        return scitaj(cisla) / cisla.length;
    }
    //TODO Vytvor metódu s nazvom pocet na zistenie poctu vstupnych hodnot s nazvom pocet
    //TODO Vytvor metodu s nazvom max na ziskame najvyssej hodnoty
    //TODO Vytvor metodu s nazvom min na ziskanie najnizsej hodnoty


    private static int pocet(double[] cisla) {
        return cisla.length;
    }

    private static double max(double[] cisla) {
        return Arrays.stream(cisla).max().getAsDouble();
    }

    private static double min(double[] cisla) {
        return Arrays.stream(cisla).min().getAsDouble();
    }
}
