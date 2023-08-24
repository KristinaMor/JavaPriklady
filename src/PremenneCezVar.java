import java.util.Date;

public class PremenneCezVar {
    public static void main(String[] args) {
        var meno = "Ján";
        var priezvisko = "Žitniak";
        var celeMeno = meno + " " + priezvisko;
        System.out.println("Jeho meno a priezvisko je: " + celeMeno);

        var a = 10;
        var b = 20;
        var sucet = a + b;
        System.out.println("Súčet a b je: " + (a + b)); //treba dať zátvorky, inak vypíše "1020"
        System.out.println("Súčet a b je: " + sucet);

        var aktualnyDatum = new Date();
        System.out.println("Aktuálny dátum a čas je: " + aktualnyDatum);


    }
}
