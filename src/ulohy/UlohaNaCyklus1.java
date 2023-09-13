package ulohy;
/*Úloha na opakovanie č.1: Vypíš maticu s údajmi od 1 do 25*/

public class UlohaNaCyklus1 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 24; i++) {
            System.out.print((i) + "\t");
            if (i % 5 == 0) System.out.println();
        }
        System.out.println(i);
    }
}