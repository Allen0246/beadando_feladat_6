package cegjegyzek;

import cegjegyzek.serializer.Serializer;
import modellek.ceg.Ceg;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cegjegyzek implements Serializable {

    private List<Ceg> cegek;

    private transient Serializer<Cegjegyzek> serializer;

    public Cegjegyzek(List<Ceg> cegek) {
        this.cegek = cegek;


    }

    public Cegjegyzek() {
        deseriaLize("cegjegyzek.txt");
    }

    public Cegjegyzek(String path) {
        deseriaLize(path);
    }

    private void deseriaLize(String path){
        this.serializer = new Serializer<>(path);


        Cegjegyzek beolvasott = serializer.deserialize();
        if (beolvasott != null){
            this.cegek = beolvasott.getCegek();
        }

    }

    public List<Ceg> getCegek() {
        return cegek;
    }


    public void setCegek(List<Ceg> cegek) {
        this.cegek = cegek;
    }

    public void addCeg(Ceg ceg){
        this.cegek.add(ceg);
    }

    public List<Ceg> getCegekOrderByBekerules(){
        List<Ceg> cegek1= this.cegek;

        Collections.sort(cegek1, new Comparator<Ceg>() {
            @Override
            public int compare(Ceg o1, Ceg o2) {
                return o1.getAlakult().compareTo(o2.getAlakult());
            }
        });
        return cegek1;
    }

    public List<Ceg> getCegekOrderByLetszam(){
        List<Ceg> cegek1= this.cegek;

        Collections.sort(cegek1, new Comparator<Ceg>() {
            @Override
            public int compare(Ceg o1, Ceg o2) {
                return o1.getLetszam() - (o2.getLetszam());
            }
        });
        return cegek1;
    }

    public List<Ceg> getCegekOrderByAlaptoke(){
        List<Ceg> cegek1= this.cegek;

        Collections.sort(cegek1, new Comparator<Ceg>() {
            @Override
            public int compare(Ceg o1, Ceg o2) {
                return o1.getAlaptoke() - (o2.getAlaptoke());
            }
        });
        return cegek1;
    }
}
