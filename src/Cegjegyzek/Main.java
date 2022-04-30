package Cegjegyzek;

import Cegjegyzek.ceg_info;
import Cegjegyzek.foglalkoztatott;
import Cegjegyzek.ugyvezeto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<foglalkoztatott> foglalkoztatott= new ArrayList<>();
    public static ArrayList<ceg_info> ceg_info=new ArrayList<>();
    public static ArrayList<ugyvezeto> ugyvezeto=new ArrayList<>();

    public static void main(String[] args) {

    }


    public static void Adatok()
    {
       foglalkoztatott f1= new foglalkoztatott("Kis Béla",20220113);
       foglalkoztatott f2= new foglalkoztatott("Forgács Aladár",20200527);

       ugyvezeto u1= new ugyvezeto("Tulipán Katalin",25);
       ugyvezeto u2= new ugyvezeto("Mészáros András",39);

       ceg_info c1= new ceg_info(2007,53,10000000,"nincs","KFT");
       ceg_info c2 = new ceg_info(2014,200,0,"Nagy Árpád","BT");
       System.out.println(f1);

    }


           /*
        Feladat:
        1.	Minden cégről tudjuk, hogy mikor alakult, ki az ügyvezetője és hányan vannak benne foglalkoztatva és milyen egyedi számmal vannak nyilvántartva.
        A cégeket nyilvántartja a cégjegyzék, aminek a listája lekérhető bekerülés, létszám vagy alaptőke szerinti rendezve.
        Az ügyvezetőknek tudjuk a korát és a végzettségét. Az ügyvezető legyen másolható objektum. Egy cég konkrétan Bt. vagy KFT. lehet.
        Ha Bt-ről van szó, akkor meg kell adni egy beltagot is, akinek a nevét tartjuk számon, ha KFT, akkor az alaptőkét, ami minimum 1M Ft.
        A beltag és az alaptőke is változhat, ezek nélkül nem jöhet létre cég.
        A cégjegyzék legyen kimenthető bináris állományba. Amikor „létrejön” egy cégjegyzék, akkor aktualizálja magát, ha van létező állomány.
        */

    public static void mentes(){
        try {
            FileWriter myWriter = new FileWriter("teszt.txt");

            Collections.sort(foglalkoztatott, (o1, o2) -> o1.getFoglalkoztatott().compareTo(o2.getFoglalkoztatott()));


            int k = 0;
            for(;k<foglalkoztatott.size();k++) {
                myWriter.write("foglalkoztatott;" + foglalkoztatott.get(k).getFoglalkoztatott() + ";" + foglalkoztatott.get(k).getBekerules() + ";" + foglalkoztatott.get(k).getAzonosito());
                myWriter.write("\n");
            }

            myWriter.close();
            System.out.println("Sikeres fájlba írás");
        } catch (IOException e) {
            System.out.println("ERROR.");
            e.printStackTrace();
        }
    }


}

