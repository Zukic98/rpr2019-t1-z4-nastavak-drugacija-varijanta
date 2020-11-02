package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Artikl testniArtikl = new Artikl("bananica",2,"bnbnc");
    private Korpa korpica = new Korpa();

    @Test
    void dodajArtikl() {
        assertTrue(korpica.dodajArtikl(testniArtikl));
    }

    @Test
    void izbaciArtiklSaKodom() {
        korpica.dodajArtikl(testniArtikl);
        korpica.dodajArtikl(new Artikl("benzin",2,"bnz"));
        korpica.dodajArtikl(new Artikl("suvenir",3,"alm"));
        korpica.izbaciArtiklSaKodom("alm");
        assertEquals(testniArtikl.getKod(),korpica.izbaciArtiklSaKodom("bnbnc").getKod());
        korpica.dodajArtikl(testniArtikl);
        assertNotNull(korpica.izbaciArtiklSaKodom("bnbnc"));
    }

    @Test
    void getArtikli() {
        Artikl[] artikli = new Artikl[6];
        korpica.dodajArtikl(testniArtikl);
        korpica.dodajArtikl(new Artikl("benzin",2,"bnz"));
        korpica.dodajArtikl(new Artikl("suvenir",3,"alm"));
        korpica.dodajArtikl(new Artikl("tinta",3,"dqs"));
        korpica.dodajArtikl(new Artikl("ulje",4,"gfs"));
        korpica.dodajArtikl(new Artikl("voce",2,"grw"));
        artikli = korpica.getArtikli();
        for(int i = 0;i < 6;i++ ){
            assertEquals(artikli[i],korpica.getArtikli()[i]);
        }
        for(int i = 0;i < 6;i++ )
            System.out.println(artikli[i].getNaziv() + " , " + artikli[i].getCijena() + " , " + artikli[i].getKod());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        korpica.dodajArtikl(new Artikl("benzin",2,"bnz"));
        korpica.dodajArtikl(new Artikl("suvenir",3,"alm"));
        korpica.dodajArtikl(new Artikl("tinta",3,"dqs"));
        assertEquals(8,korpica.dajUkupnuCijenuArtikala());
    }
}