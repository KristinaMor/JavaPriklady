public class CyklySPevnymPoctomOpakovani {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println(); //prazdny riadok
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();
        //vypis parnych cisiel, da sa pouyit aj zapis i+=2
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.print(i);
        }
        System.out.println();
        //vypis parnych cisel odzadu
        for (int i = 10; i >= 2; i=i-2) {
            System.out.print(i+"\t"); //tabulator na odsadenie hodnoty
        }

        System.out.println(); //vnaranie cyklov

        //TODO Ako vypisat hodnotu od 1 do 100, aby v prvom riadku vypisalo od 1 do 10, v druhom od 11 do 20, v tretom od 21 do 30, atď.

        for (int x = 1; x <= 100; x++) {
            System.out.print(x+ "\t");
            if (x % 10 == 0) System.out.println();
        }

        System.out.println("\nPodobná úloha ako vyššie s využitim 2 cyklov, resp. vnoreného");
        // Podobna uloha ako vyssie s vyuzitim 2 cyklov, resp. vnoreneho
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((10 * i + j) + "\t");
        }
        System.out.println();
        }
    }
}