package ulohy;

//Obdobná matica, ktorá bude osahovať dvojnásobok predchadzajucej hodnoty (začneme 1)

public class UlohaNaCyklus2 {
    public static void main(String[] args) {
        int cislo = 1;
        for (int x = 1; x < 26; x++) {
            System.out.printf("%10d", cislo);
            if (x % 5 == 0) {
                System.out.printf("\n");
            }
            cislo = cislo * 2;
        }
        int cislo1 = 1;
        int i;
        for (i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(cislo1 + "\t");
                cislo1 = cislo1 * 2;
            }
            System.out.println();
        }
        /* Bonusová úloha č. 2: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej hodnoty (začneme 1), takže bude to vyzerať nasledujúco:
         */
        System.out.println();
        int cislo2 = 1;
        for (i = 1; i <= 5; i++) {
            int j;
            for (j = 1; j <= 5; j++) {
                System.out.print(cislo2 + "\t");
                cislo2 = cislo2 * 2;
            }
            System.out.println();
        }
    }
}