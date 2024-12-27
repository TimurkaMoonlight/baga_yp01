package ru.bagabiev.bagabiev_example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.bagabiev.bagabiev_example.util.Manager.showSecondScene;

public class SecondController {

    @FXML
    private Button goButton;

    @FXML
    void goB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");
    }

}
