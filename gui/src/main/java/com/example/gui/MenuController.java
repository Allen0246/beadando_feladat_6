package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button CegFelvitelButton;

    @FXML
    private Button FajlKimentesButton;
    @FXML
    private AnchorPane MenuAP;


    @FXML
    private void CegFelvitelButtonClick(ActionEvent event) throws IOException {

            AnchorPane pane = FXMLLoader.load(getClass().getResource("kftorbt-view.fxml"));
            MenuAP.getChildren().setAll(pane);

    }

    @FXML
    private void FajlKimentesButtonClick(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fajlbakimentes-view.fxml"));
        MenuAP.getChildren().setAll(pane);

    }

    @FXML
    private void CegjegyzekLekereseButtonClick(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("cegjegyzeklekerese-view.fxml"));
        MenuAP.getChildren().setAll(pane);

    }
}
