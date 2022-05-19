package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SAdatfelvitelController {
    @FXML
    private Button RendbenButton;

    @FXML
    private AnchorPane SAdatfelvitelAP;

    @FXML
    void RendbenButtonClick(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menu-view.fxml"));
        SAdatfelvitelAP.getChildren().setAll(pane);

    }
}
