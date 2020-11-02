package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private Artikl[] nizArtikala = new Artikl[50];
    private int dimenzijaSupermarketa;

    public boolean dodajArtikl(Artikl a){
        if(dimenzijaSupermarketa == 50)return false;
        nizArtikala[dimenzijaSupermarketa] = a;
        dimenzijaSupermarketa++;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0;i<dimenzijaSupermarketa;i++)
            if(kod.equals(nizArtikala[i].getKod())){
                Artikl pomocni = new Artikl(nizArtikala[i]);
                for(int j = i+1;j<dimenzijaSupermarketa;j++) {
                    nizArtikala[i] = nizArtikala[j];
                    i++;
                }
                nizArtikala[dimenzijaSupermarketa-1] = null;
                dimenzijaSupermarketa--;
                return pomocni;
            }
        return null;
    }

    public Artikl[] getArtikli() {
        return nizArtikala;
    }

    public int dajUkupnuCijenuArtikala() {
        int sumaArtikala = 0;
        for (Artikl artikl : nizArtikala)
            if(artikl != null)sumaArtikala = sumaArtikala + artikl.getCijena();
        return sumaArtikala;
    }
}
