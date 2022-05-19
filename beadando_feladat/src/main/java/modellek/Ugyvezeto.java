package modellek;

import java.io.Serializable;

public class Ugyvezeto implements Serializable, Cloneable {

    private int kor;
    private String vegzettseg;

    public Ugyvezeto(int kor, String vegzettseg) {
        this.kor = kor;
        this.vegzettseg = vegzettseg;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public String getVegzettseg() {
        return vegzettseg;
    }

    public void setVegzettseg(String vegzettseg) {
        this.vegzettseg = vegzettseg;
    }
}
