package ulohy;

/*Vytvorte jednoduchý program, ktorého cieľom bude výpočet 5 základných matematických operácií a to sčítanie (+), odčítanie (-), násobenie (*) a delenie (/), modulo (%).
Matematické operácie budú “narábať” s dvoma hodnotami, ktoré budú zadané v premenných, napr. cislo1  a cislo2.
Pozn.: Nezabúdať na to, že sa môže jednať o desatinné čísla.
Program nám zároveň vypíše takýto text:
Výsledkom sčítania hodnôt 2 a 3 je 5.
Výsledkom odčítania hodnôt 2 a 3 je -1.
atď.*/

public class ZakladneMatematickeOperacie {
    public static void main(String[] args) {
        double cislo1 = 2.3, cislo2 = 4.5;
        double scitanie = cislo1 + cislo2;
        double odcitanie = cislo1 - cislo2;
        double nasobenie = cislo1 + cislo2;
        double delenie = cislo1 / cislo2;
        double modulo = cislo1 % cislo2;

        System.out.println("Výsledkom odcitania hodnôt " + odcitanie);
        System.out.printf("Výsledkom nasobenia hodnôt " + nasobenie + "\n");
        System.out.printf("Výsledkom delenia hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, delenie);
        System.out.printf("Výsledkom modula (zvyšku po delení) hodnôt %.1f a %.1f je %.1f%n", cislo1, cislo2, modulo);
        ;

        System.out.println("Výsledkom sčítania hodnôt " + cislo1 + " a " + cislo2 + " je " + scitanie);
        System.out.printf("Výsledok sčítania hodnôt %.1f a %.1f je %.1f", cislo1, cislo2, scitanie);

        String name = "Cameron";
        String site = "TechTarget";
        System.out.printf("\nI like the stuff %s writes on %S. %n", name, site); //%S zväčší všetky malé písmená na veľké, %s zmenší, %n odsadí dalsí text na nový riadok


    }
}
