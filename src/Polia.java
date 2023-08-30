public class Polia {
    public static void main(String[] args) {
        //Deklaria pola s nazvom cars ktore obsahuje 4 znacky
        String cars [] = {"Volvo", "BMW","Ford", "Mazda" };

        System.out.println(cars[0]); //vypise auto na prvom mieste
        System.out.println(cars[3]);
        cars[0] = "Opel"; //zmeni prve auto
        System.out.println(cars[0]);

        //Pocet vsetkych znaciek aut v poli
        System.out.println(cars.length);

        //Vypis vsetkych aut v poli
        System.out.println("Vypíše všetky značky áut: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
