package Úlohy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.isLetter;

public class PriradenieZnamkyAUkoncenieCezQ {
    public static void main(String[] args) {
        while (true) { //nekonecny cyklus
            Scanner skener = new Scanner(System.in);
            System.out.println("Zadaj počet bodov: ");
            String pocetBodov = skener.nextLine(); // NextLine je pre akkolvek String, cize text, ale aj cislo sa v tomto pripade berie ako text

            //Akym sposobom ukoncit while. Hint: vpisanim pismena q
            if (pocetBodov.equals("q") || pocetBodov.equals("Q")) break;


            try {
                int pocetBodovAkoInt = Integer.parseInt(pocetBodov);
                if (pocetBodovAkoInt >= 90) System.out.println("Tvoja známka je A");
                else if (pocetBodovAkoInt >= 75) System.out.println("Tvoja znamka je B");
                else if (pocetBodovAkoInt >= 50) System.out.println("Tvoja znamka je C");
                else System.out.println("Neviem priradit znamku k danemu poctu bodov");
            } catch (NumberFormatException e) {
                System.out.println("Akceptovatelne pismeno, resp. znak je q alebo Q na ukoncenie programu");
            }
        }
    }
}
