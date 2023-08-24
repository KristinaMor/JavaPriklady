package Úlohy;


import java.text.Normalizer;
import java.util.Scanner;

public class SamostatnaUloha {

    public static String removeDiacritics(String text) {
        return Normalizer.normalize(text, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .replaceAll("[^\\p{ASCII}]", "");
    }

    public static void main(String[] args) {
        while (true) {
            String znamkaAkoSlovo = String.valueOf(0);
            Scanner skener = new Scanner(System.in);

            System.out.println("Zadaj textovú známku: ");
            String znamka = skener.nextLine();
            znamka = removeDiacritics(znamka);
            System.out.println("Známka po odstránení diakritiky: " + znamka);

            if (znamka.equals("koniec")) break;

            try {
                if (znamka.equals("vyborny")) System.out.println("Tvoja známka je 1");
                else if (znamka.equals("chvalitebny")) System.out.println("Tvoja známka je 2");
                else if (znamka.equals("dobry")) System.out.println("Tvoja známka je 3");
                else if (znamka.equals("dostatocny")) System.out.println("Tvoja známka je 4");
                else if (znamka.equals("nedostatocny")) System.out.println("Tvoja známka je 5");
                else System.out.println("Chybné zadanie.");
            } catch (Exception e) {


                System.out.println("Prepáč, zadal si nesprávny formát");
                skener.close();
            }
        }
    }
}