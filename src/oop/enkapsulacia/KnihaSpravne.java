package oop.enkapsulacia;

public class KnihaSpravne {
    //Vytvorili sme atribúty (fields) triedy
    private String nazov;
    private String autor;
    private int rokVydania;
    private double cena;

//Bezparametricky konstruktor resp. prazdny konstruktor
    public KnihaSpravne() {
    }

    //Parametricky konstruktor
//Prvotny zmysel je naplnenie objektu (instanciu triedy)
    public KnihaSpravne(String nazov, String autor, int rokVydania, double cena) {
        this.nazov = nazov;
        this.autor = autor;
        this.rokVydania = rokVydania;
        this.cena = cena;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        //Dalsia aplikacna logika, prip. nejaka kontrola, overenie premennej (parametra) nazov predtym ako ju vložíme do atributu triedy
        this.nazov = nazov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Názov knihy: " + nazov + "\nAutor knihy: " + autor + "\nCena knihy: " + cena + "\nRok vydania knihy: " + rokVydania;
    }
}
