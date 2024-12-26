package ru.bagabiev.bagabiev_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.bagabiev.bagabiev_task1.util.Manager.showSecondStage;

public class Main {

    @FXML
    private Button BackButton;

    @FXML
    private Button Login;

    @FXML
    private Button begunBut;

    @FXML
    void BackButtonOnAction(ActionEvent event) {
        showSecondStage("begyn-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void begButtonOnAction(ActionEvent event) {
        showSecondStage("two.fxml","Marathon Skills 2016 - Register as a runner");

    }

    public void LoginButton(ActionEvent actionEvent) {
        showSecondStage("three.fxml","Marathon Skills 2016 - Register as a runner");
    }

    public void LogoutButton(ActionEvent actionEvent) {
    }
}
