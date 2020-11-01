package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    ArrayList<Artikl> listaArtikala;

    public boolean dodajArtikl(Artikl a){
        if(listaArtikala.size()==0)return false;
        listaArtikala.add(a);
        return true;
    }

    public Artikl[] getArtikli() {
        return listaArtikala.toArray(new Artikl[0]);
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


}
