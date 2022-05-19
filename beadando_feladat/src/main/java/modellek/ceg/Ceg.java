package modellek.ceg;

import modellek.Ugyvezeto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Ceg implements Serializable {

    private Date alakult;
    private Ugyvezeto ugyvezeto;
    private int letszam;
    private List<Integer> alkalmazottIDs;
    private int alaptoke;
    private String beltagnev;
    private modellek.ceg.CegTipus cegTipus;


    public Ceg(Date alakult, Ugyvezeto ugyvezeto, int letszam, List<Integer> alkalmazottIDs, String beltagnev) {
        this.alakult = alakult;
        this.ugyvezeto = ugyvezeto;
        this.letszam = letszam;
        this.alkalmazottIDs = alkalmazottIDs;
        this.beltagnev = beltagnev;
        this.cegTipus = modellek.ceg.CegTipus.BT;
    }
    public Ceg(Date alakult, Ugyvezeto ugyvezeto, int letszam, List<Integer> alkalmazottIDs, int alaptoke) throws modellek.ceg.KftLetrehozasiHiba {
        this.alakult = alakult;
        this.ugyvezeto = ugyvezeto;
        this.letszam = letszam;
        this.alkalmazottIDs = alkalmazottIDs;
        if (alaptoke<1000000) {
            throw new modellek.ceg.KftLetrehozasiHiba("Nem elég az alaptőke");
        }
        this.alaptoke = alaptoke;
        this.cegTipus = modellek.ceg.CegTipus.KFT;
    }

    public Ceg(Date alakult, Ugyvezeto ugyvezeto, int letszam, List<Integer> alkalmazottIDs, int alaptoke, String beltagnev, modellek.ceg.CegTipus cegTipus) {
        this.alakult = alakult;
        this.ugyvezeto = ugyvezeto;
        this.letszam = letszam;
        this.alkalmazottIDs = alkalmazottIDs;
        this.alaptoke = alaptoke;
        this.beltagnev = beltagnev;
        this.cegTipus = cegTipus;
    }

    public Date getAlakult() {
        return alakult;
    }

    public void setAlakult(Date alakult) {
        this.alakult = alakult;
    }

    public Ugyvezeto getUgyvezeto() {
        return ugyvezeto;
    }

    public void setUgyvezeto(Ugyvezeto ugyvezeto) {
        this.ugyvezeto = ugyvezeto;
    }

    public int getLetszam() {
        return letszam;
    }

    public void setLetszam(int letszam) {
        this.letszam = letszam;
    }

    public List<Integer> getAlkalmazottIDs() {
        return alkalmazottIDs;
    }

    public void setAlkalmazottIDs(List<Integer> alkalmazottIDs) {
        this.alkalmazottIDs = alkalmazottIDs;
    }

    public int getAlaptoke() {
        return alaptoke;
    }

    public void setAlaptoke(int alaptoke) {
        this.alaptoke = alaptoke;
    }
    public String getBeltagnev() {
        return beltagnev;
    }

    public void setBeltagnev(String beltagnev) {
        this.beltagnev = beltagnev;
    }
}
