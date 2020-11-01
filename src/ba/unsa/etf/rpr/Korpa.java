package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Artikl> listaArtikala;
    public boolean dodajArtikl(Artikl a){
        for(int i = 0;i< listaArtikala.size();i++)
            if(a.equals(listaArtikala.get(i)))
    }

}
