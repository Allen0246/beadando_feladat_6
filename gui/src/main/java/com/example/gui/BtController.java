package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BtController {
    @FXML
    private Label AlakultLB;

    @FXML
    private AnchorPane BtAP;

    @FXML
    private Label LetszamLB;

    @FXML
    private Label UgyvezetoLB;

    @FXML
    private TextField alakultTF;

    @FXML
    private TextField beltagTF;

    @FXML
    private TextField letszamTF;

    @FXML
    private Button megadButton;

    @FXML
    private TextField ugyvezetoTF;

    @FXML
    void megadButtonClick(ActionEvent event) throws IOException {

        AnchorPane pane= FXMLLoader.load(getClass().getResource("ugyvezeto-view.fxml"));
        BtAP.getChildren().setAll(pane);

    }
}
