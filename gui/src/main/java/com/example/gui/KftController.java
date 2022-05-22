package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import modellek.ceg.Ceg;
import cegjegyzek.Cegjegyzek;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KftController {

    @FXML
    private Label Alaptoke;

    @FXML
    private TextField AlaptokeTF;

    @FXML
    private Button BekuldButton;

    @FXML
    private AnchorPane KftAP;

    @FXML
    private Label Letszam;

    @FXML
    private TextField LetszamTF;

    @FXML
    private Label Mikoralakult;

    @FXML
    private TextField MikoralakultTF;

    @FXML
    private Label Ugyvezeto;

    @FXML
    private TextField UgyvezetoTF;

    @FXML
    private Label testlabel;

    @FXML
    private void BekuldButtonClick(ActionEvent event) throws IOException {
        System.out.println("Sikeres gombra kattintas"); // consolra írja ki
        //testlabel.setText(MikoralakultTF.getText()+ "test"); // text fielden bevitt értéket kiírja a labelra
        System.out.println("A ceg: " + MikoralakultTF.getText()+" alakult, " + "alaptokevel rendelkezik" + AlaptokeTF.getText()
                + ", az ugyvezetoje" +UgyvezetoTF.getText() +", letszammal" + LetszamTF.getText()+ "rendelkezik a ceg"); // consolra ki printeli amit bevisz a textfielden

        AnchorPane pane= FXMLLoader.load(getClass().getResource("ugyvezeto-view.fxml"));
        KftAP.getChildren().setAll(pane);


        String ugyvezeto=UgyvezetoTF.getText();

        String letszam = LetszamTF.getText();
        int letszamtoint = Integer.parseInt(letszam);
        System.out.println("Ez van elterolva a valtozoban int-e alakitva: " + letszamtoint);

        String alaptoke = AlaptokeTF.getText();
        int alaptoketoint = Integer.parseInt(letszam);

        /*String MikorAlakultST = MikoralakultTF.getText();
        try {
            Date MikorAlakulttodate = new SimpleDateFormat("dd-MMMM-yyyy").parse(MikorAlakultST);
        }catch (Exception e) {
            System.out.println("Nem sikerült átalakítani datumma");
        }*/
        //Ceg ceg = new Ceg();
    }
}
