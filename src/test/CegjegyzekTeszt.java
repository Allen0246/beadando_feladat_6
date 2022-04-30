import cegjegyzek.Cegjegyzek;
import cegjegyzek.serializer.Serializer;
import modellek.Ugyvezeto;
import modellek.ceg.Ceg;
import modellek.ceg.KftLetrehozasiHiba;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CegjegyzekTeszt {
    @Test
    public void cegjegyzekLetrehozasaTeszt() {
        List<Ceg> cegek =  new ArrayList<>();
        Cegjegyzek cegjegyzek = new Cegjegyzek(cegek);

        Assertions.assertNotNull(cegjegyzek);


        cegjegyzek.addCeg(
                new Ceg(
                        new Date(2022,1,1),
                        new Ugyvezeto(30,"Egyip Tomi"),
                        2,
                        Arrays.asList(1, 2),
                        "Remek Elek"
                )
                );
    }
    @Test
    public void kftLetrehozasaTeszt(){
        List<Ceg> cegek =  new ArrayList<>();
        Cegjegyzek cegjegyzek = new Cegjegyzek(cegek);

        Assertions.assertEquals(0,cegjegyzek.getCegek().size());


        //valid KFT
        try {
            cegjegyzek.addCeg(createKft(1250000));

        }catch (KftLetrehozasiHiba e) {
            Assertions.assertNull(e);

        }
        Assertions.assertEquals(1,cegjegyzek.getCegek().size());
        //invalid KFT
        try {
            cegjegyzek.addCeg(createKft(125000));

        }catch (KftLetrehozasiHiba e) {
            Assertions.assertNotNull(e);
        }

        Assertions.assertEquals(1,cegjegyzek.getCegek().size());

    }
    @Test
    public void btLetrehozasaTeszt(){
        Cegjegyzek cegjegyzek=cegjegyzekEgyDbBtVel();

        Assertions.assertEquals(1,cegjegyzek.getCegek().size());


    }

    @Test
    public void saveAndLoadCegjegyzek(){
        String path = "cegjegyzek.txt";

        Cegjegyzek cegjegyzek = cegjegyzekEgyDbBtVel();

        Serializer<Cegjegyzek> serializer = new Serializer<>(path, cegjegyzek);
        Boolean isSerialized = serializer.serialize();

        Assertions.assertTrue(isSerialized);

        cegjegyzek = new Cegjegyzek(path);

        Assertions.assertNotNull(cegjegyzek);
        Assertions.assertNotNull(cegjegyzek.getCegek());
        Assertions.assertEquals(1,cegjegyzek.getCegek().size());
    }


    private Cegjegyzek cegjegyzekEgyDbBtVel(){
        List<Ceg> cegek =  new ArrayList<>();
        Cegjegyzek cegjegyzek = new Cegjegyzek(cegek);

        Assertions.assertEquals(0,cegjegyzek.getCegek().size());


        //valid BT
        cegjegyzek.addCeg(
                new Ceg(
                        new Date(2021, 1, 1),
                        new Ugyvezeto(30, "Git Áron"),
                        3,
                        Arrays.asList(1, 2, 3),
                        "Remek Elek"
                )
        );
        return cegjegyzek;
    }

    private Ceg createKft(int alaptoke) throws KftLetrehozasiHiba{
      return  new Ceg(
                new Date(2021, 1, 1),
                new Ugyvezeto(30, "Git Áron"),
                2,
                Arrays.asList(1, 2, 3),
                alaptoke
            );
    }

}
