package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FajlbaKimentesController {
    @FXML
    private Button MentesButton;

    @FXML
    private Label SikeresMentesLB;

    @FXML
    private Label SikertelenMentesLB;

    @FXML
    private Button VisszaButton;

    @FXML
    private AnchorPane fajlbakimentesAP;

    @FXML
    void MentesButtonClick(ActionEvent event) {

    }

    @FXML
    void VisszaButtonClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        fajlbakimentesAP.getChildren().setAll(pane);

    }


}
