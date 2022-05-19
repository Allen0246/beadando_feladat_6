package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CegjegyzeklekereseController {
    @FXML
    private Button LekeresButton;

    @FXML
    private Button VisszaButton;

    @FXML
    private AnchorPane cegjegyzeklekeresAP;

    @FXML
    void LekeresButtonClick(ActionEvent event) {

    }

    @FXML
    void VisszaButtonClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        cegjegyzeklekeresAP.getChildren().setAll(pane);

    }

}
