package Cegjegyzek;

//ha se alaptőke se beltag nincs megadva akkor ne fusson le a programm
//foglalkoztatottak egyedi számmal (ID-vel ) vannak ellátva

public class ceg_info {
    int alakulas;
    int letszam;
    int alaptoke;
    String beltag;
    String btvkft;

    public ceg_info(int alakulas, int letszam, int alaptoke, String beltag, String btvkft){
        this.alakulas=alakulas;
        this.letszam=letszam;
        this.alaptoke=alaptoke;
        this.beltag=beltag;
        this.btvkft=btvkft;
    }
    public void setAlakulas(){
        this.alakulas=alakulas;
    }
    public int getAlakulas(){
        return alakulas;
    }
    public void setLetszam(){
        this.letszam=letszam;
    }
    public int getLetszam(){
        return letszam;
    }
    public void setAlaptoke(){
        this.alaptoke=alaptoke;
    }
    public int getAlaptoke(){
        return alaptoke;
    }
    public void setBeltag(){
        this.beltag=beltag;
    }
    public String getBeltag(){
       return beltag;
    }
    public void setBtvkft(){
        this.btvkft=btvkft;
    }
    public String getBtvkft(){
        return btvkft;
    }
}
