package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Artikl> listaArtikala = new ArrayList<>();

    public void dodajArtikl(Artikl a){
        listaArtikala.add(a);
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
