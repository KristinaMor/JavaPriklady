public class Polia {
    public static void main(String[] args) {
        //Deklaria pola s nazvom auta ktore obsahuje 4 znacky
        String auta [] = {"Volvo", "BMW","Ford", "Mazda" };

        System.out.println(auta[0]); //vypise auto na prvom mieste
        System.out.println(auta[3]);
        auta[0] = "Opel"; //zmeni prve auto
        System.out.println(auta[0]);

        //Pocet vsetkych znaciek aut v poli
        System.out.println(auta.length);

        //Vypis vsetkych aut v poli
        System.out.println("Vypíše všetky značky áut: ");
        for (int i = 0; i < auta.length; i++) {
            System.out.println(auta[i]);
        }
        System.out.println();

        for (String konkretnaZnacka:auta) {
            System.out.println(konkretnaZnacka);
        }
        //TODO doplniť ešte jedno auto do pola auta - toto nie je take jednoduche kvoli statickosti

        int [] cislo = new int [8]; //inicializacia statickeho pola s 8 prvkami
        cislo[0] = 10;
        System.out.println(cislo[0]);
        System.out.println(cislo[1]);
    }
}
