package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    String nazivArtikla;
    int cijenaArtikla;
    String kodArtikla;

    public Artikl(String naziv, int cijena, String s) {
        nazivArtikla =naziv;cijenaArtikla=cijena;kodArtikla=s;
    }

    public Artikl(Artikl a){
        nazivArtikla=a.getNaziv();
        cijenaArtikla=a.getCijena();
        kodArtikla=a.getKod();
    }

    public String getNaziv() {
        return nazivArtikla;
    }

    public int getCijena() {
        return cijenaArtikla;
    }

    public String getKod() {
        return kodArtikla;
    }
}
