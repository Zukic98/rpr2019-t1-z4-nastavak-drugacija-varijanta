package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Artikl testniArtikl = new Artikl("bananica",2,"bnbnc");
    private Supermarket supermarket= new Supermarket();


    @Test
    void dodajArtikl() {
        supermarket.dodajArtikl(testniArtikl);
        assertEquals(1,supermarket.getDimenzija());
    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}