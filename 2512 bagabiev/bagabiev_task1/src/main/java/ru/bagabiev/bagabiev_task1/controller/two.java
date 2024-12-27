package ru.bagabiev.bagabiev_task1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.bagabiev.bagabiev_task1.util.Manager.*;

public class two {

    @FXML
    private Button backButton;

    @FXML
    private Button newButton;

    @FXML
    private Button oldButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button loginButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");

    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        showSecondStage("three.fxml", "Marathon Skills 2016 - Login");

    }

    @FXML
    void newButtonOnAction(ActionEvent event) {
        showSecondStage("four.fxml", "Marathon Skills 2016 – Register as a runner");

    }

    @FXML
    void OldButtonOnAction(ActionEvent event) {

        showSecondStage("three.fxml", "Marathon Skills 2016 - Login");
    }

    @FXML
    void logButtonOnAction(ActionEvent event) {

        showSecondStage("begyn-view.fxml", "Marathon Skills 2016");
    }
}


