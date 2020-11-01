package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> listaArtikala = new ArrayList<>();

    public boolean dodajArtikl(Artikl a){
        if(listaArtikala.size()==50)return false;
        listaArtikala.add(a);
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0;i< listaArtikala.size();i++)
            if(kod.equals(listaArtikala.get(i).getKod())){
                Artikl pomocni = new Artikl(listaArtikala.get(i));
                listaArtikala.remove(i);
                return pomocni;
            }
        return null;
    }

    public Artikl[] getArtikli() {
        return listaArtikala.toArray(new Artikl[0]);
    }

    public int dajUkupnuCijenuArtikala() {
        int sumaArtikala = 0;
        for (Artikl artikl : listaArtikala) sumaArtikala = sumaArtikala + artikl.getCijena();
        return sumaArtikala;
    }
}
