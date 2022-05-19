package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class KftOrBtController {
    @FXML
    private AnchorPane KftOrBtAP;

    @FXML
    private Button btButton;

    @FXML
    private Button kftButton;

    @FXML
    void btButtonClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("bt-view.fxml"));
        KftOrBtAP.getChildren().setAll(pane);

    }

    @FXML
    void kftButtonClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("kft-view.fxml"));
        KftOrBtAP.getChildren().setAll(pane);

    }
}
