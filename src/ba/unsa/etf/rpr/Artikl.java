package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    String nazivArtikla;
    int cijenaArtikla;
    String kodArtikla;

    public Artikl(String naziv, int cijena, String s) {
        nazivArtikla =naziv;cijenaArtikla=cijena;kodArtikla=s;
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

    @Override
    public boolean equals(Artikl artikl) {
        return kodArtikla.equals(artikl.getKod());
    }
}
