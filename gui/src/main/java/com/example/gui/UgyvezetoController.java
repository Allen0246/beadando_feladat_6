package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UgyvezetoController {
    @FXML
    private Button BekuldButton2;

    @FXML
    private Label Eletkora;

    @FXML
    private TextField EletkoraTF;

    @FXML
    private Label Ugyvezetoneve;

    @FXML
    private TextField UgyvezetpneveTF;

    @FXML
    private TextField VegzettsegTF;

    @FXML
    private Label Vegzettsege;

    @FXML
    private AnchorPane UgyvezetoAP;

    @FXML
    private Label testlabel;

    @FXML
    void BekuldButtonClick2(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sadatfelvitel-view.fxml"));
        UgyvezetoAP.getChildren().setAll(pane);
        System.out.println("Az ugyvezeto vegzettsege " + VegzettsegTF.getText()+ ", az ugyvezeto eletkora" + EletkoraTF.getText());
    }

}
