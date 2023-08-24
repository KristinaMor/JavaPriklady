// kazdy program bude zacinat triedou, cize musime pouzit slovo class, obycajne aj v spojeni s public
// nazov triedy koresponduje s konvenciou Camel, cize velke a male pismena, pri viacerych slovach oddelime velkym a malym
public class HelloWorld {
    public static void main(String[] args) { // metoda main je dolezita pre spustenie programu
        System.out.println("\nHello, \nWorld!"); // System.out.println je kombinacia prikazov, ktore vypisuju do "konzoly" - run dialogu
        System.out.println("Kika"); // ak klikneš v dalsom riadku sout, vypise ti to z predosleho riadku prikaz
        System.out.println("online kurz java developer junior");
        System.out.print("Nejaký text č. 1"); // kombinacia \n vlozi novy riadok - escape characters
        System.out.print("\n\n\nNejaký text č. 2"); // AltGr + q vpíše znak \
        System.out.println("\n\tOdsadený text"); // \t odsadí text
        // TODO napisať, resp. vyskusat dalsie escape characters spolu s ukazkami dalsich troch escape characters
        System.out.println("Hello World\b\b");
        System.out.println("\fJava Developer\f"); // \f printne odtial na novej strane
        System.out.println("\t\'Kristína\'"); // ked chceme odlisit text s uvodzovkami \"
        System.out.println("\n\t\"Citacia3\"\\"); // \s urobi space
        // vypisanie spatnej lomky takto \\
        System.out.println(20); // komentovanie sa dá dať aj cez Code hore, aj celý blok
        System.out.println("jj\rXXX"); // \r presunie kurzor na začiatok a napíše len to čo je za ním
    }
} // AltGr + n vlozi zlozenu zatvorku, teda }
