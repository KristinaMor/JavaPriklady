package ulohy;

// TODO Vytvorte metody obdobnym sposobom aj pre odcitanie, nasobenie, delenie a modulo

public class ZakladneMatematickeOperacieCezMetody {
       public static double scitanie(double cislo1, double cislo2) {
       double sucet = cislo1 + cislo2;
       return sucet;
      // return cislo1 + cislo2;
   }

   public static double odcitanie(double cislo1, double cislo2) {
       return cislo1 - cislo2;
   }

    public static double nasobenie(double cislo1, double cislo2) {
       return cislo1 * cislo2;
    }

    public static double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    public static double modulo(double cislo1, double cislo2) {
        return cislo1 % cislo2;
    }

    public static void vypis(String operacia, double cislo1, double cislo2, double vysledok) {
        System.out.printf("%10s %s %.1f a %.1f je: %.1f%n","", operacia, cislo1, cislo2, vysledok); //na odsadenie o 10, trebalo pridat dalsi argument, resp. prazdny text, ktory je reprezentovany
    }

    public static void main(String[] args) {
        double cislo1 = 8, cislo2 = 2.5;
        //scitanie(cislo1, cislo2);
     /*   System.out.println("Súčet 2 čísel " + scitanie(cislo1, cislo2));
        System.out.printf("Súčet 2 čísel %.1f a %.1f je %.1f%n", cislo1, cislo2, scitanie(cislo1, cislo2));
        System.out.printf("Rozdiel 2 čísel %.1f a %.1f je %.1f%n", cislo1, cislo2, odcitanie(cislo1, cislo2));
        System.out.printf("Násobenie 2 čísel %.1f a %.1f je %.1f%n", cislo1, cislo2, nasobenie(cislo1, cislo2));
        System.out.printf("Podiel 2 čísel %.1f a %.1f je %.1f%n", cislo1, cislo2, delenie(cislo1, cislo2));
        System.out.printf("Zvyšok po delení 2 čísel %.1f a %.1f je %.1f%n", cislo1, cislo2, modulo(cislo1, cislo2));*/

        //Vypis vysledkov matematickych operacii volanim metody vypis
        vypis("Súčet", cislo1, cislo2, scitanie(cislo1, cislo2));
        vypis("Rozdiel", cislo1, cislo2, odcitanie(cislo1, cislo2));
        vypis("Násobenie", cislo1, cislo2, nasobenie(cislo1, cislo2));
        vypis("Podiel", cislo1, cislo2, delenie(cislo1, cislo2));
        vypis("Modulo", cislo1, cislo2, modulo(cislo1, cislo2));
    }
}
