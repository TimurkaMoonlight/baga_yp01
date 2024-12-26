package ru.bagabiev.bagabiev_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.bagabiev.bagabiev_task1.util.Manager.showSecondStage;

public class seven {

    @FXML
    private Button LogoutButton;


    @FXML
    private Button BackButton;


    @FXML
    private Button regmarButton;

    @FXML
    void regmarButtonOnAction(ActionEvent event) {
        showSecondStage("five.fxml", "Marathon Skills 2016 – Register for an event");
    }

    @FXML
    void BackButtonOnAction(ActionEvent actionEvent) {
        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void LogoutButtonOnAction(ActionEvent actionEvent) {
        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");
    }
}

