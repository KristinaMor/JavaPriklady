import java.util.ArrayList;
import java.util.Collections;

public class DynamickePolia {
    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList<String>();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("Ford");
        auta.add("Mazda");
        auta.add("Volkswagen");

        //Vypis prvej položky
        System.out.println(auta.get(0));

        //Zmena značky prveho auta
        auta.set(0, "Opel");
        System.out.println(auta.get(0));

        //Odstranenie prvej položky dynamickeho pola
        auta.remove(0);

        //Odstranenie všetkych poloziek v ArrayList: auta.clear();

        System.out.println("Veľkosť pola je: " + auta.size());

//        System.out.println(auta);
        //Vypis všetky autá cez for-each
        System.out.println("\nVypis vsetky auta cez for-each: ");
        for (String konkretneAuto:auta) {
            System.out.print(konkretneAuto + "\t");
            
        }
            System.out.println("\nVypíš všetky auta cez for: ");
            for (int i = 0; i < auta.size(); i++) {
            System.out.print(auta.get(i) + "\t");
            }

            ArrayList<Integer> dynamickePoleCisiel = new ArrayList<>();
            dynamickePoleCisiel.add(20);
            dynamickePoleCisiel.add(4);
            dynamickePoleCisiel.add(5);

            System.out.println("\nVypis vsetky cele cisla: ");
            for(Integer konkretneCislo :dynamickePoleCisiel)
                System.out.println(konkretneCislo);

        Collections.sort(dynamickePoleCisiel); //zoradenie čisel v poli od najmenšieho po najväčšie
        System.out.println(dynamickePoleCisiel);

    }
}
