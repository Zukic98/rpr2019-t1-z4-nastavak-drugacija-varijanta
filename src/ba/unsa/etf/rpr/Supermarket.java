package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] nizArtikala = new Artikl[1000];
    private int dimenzijaSupermarketa;

    public int getDimenzija(){
        return dimenzijaSupermarketa;
    }

    public void dodajArtikl(Artikl a){
        nizArtikala[dimenzijaSupermarketa] = a;
        dimenzijaSupermarketa++;
    }

    public Artikl[] getArtikli() {
        return nizArtikala;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0;i<dimenzijaSupermarketa;i++)
            if(kod.equals(nizArtikala[i].getKod())){
                Artikl pomocni = new Artikl(nizArtikala[i]);
                for(int j = i+1;j<dimenzijaSupermarketa;j++) {
                    nizArtikala[i] = nizArtikala[j];
                    i++;
                }
                dimenzijaSupermarketa--;
                nizArtikala[dimenzijaSupermarketa-1] = null;
                return pomocni;
            }
        return null;
    }


}
