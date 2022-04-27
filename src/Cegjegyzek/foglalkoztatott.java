package Cegjegyzek;

public class foglalkoztatott {
    public static int foglalkoztatottID =0;
    private String foglalkoztatott;
    private int bekerules;
    private int azonosito;

    public foglalkoztatott(String foglalkoztatott, int bekerules){
        this.foglalkoztatott= foglalkoztatott;
        this.bekerules=bekerules;
        foglalkoztatottID++;
        this.azonosito=foglalkoztatottID;

    }

    public foglalkoztatott(String foglalkoztatott, int bekerules, int id){
        this.foglalkoztatott=foglalkoztatott;
        this.bekerules=bekerules;
        foglalkoztatottID=id;
        this.azonosito=id;

    }

    public void setFoglalkoztatott(String foglalkoztatott){
        this.foglalkoztatott=foglalkoztatott;
    }

    public String getFoglalkoztatott(){
        return foglalkoztatott;
    }
    public void setBekerules(int bekerules){
        this.bekerules=bekerules;
    }

    public int getBekerules(){
        return bekerules;
    }
    public int getAzonosito(){
        return azonosito;
    }
}
