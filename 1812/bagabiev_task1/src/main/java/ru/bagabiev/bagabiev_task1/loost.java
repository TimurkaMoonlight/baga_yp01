package ru.bagabiev.bagabiev_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost {

    @FXML
    private TextField aText;

    @FXML
    private Label tura;

    @FXML
    void casual(ActionEvent event) {
        try {


            double mass = Double.parseDouble(aText.getText());
            int tonn = (int) (mass / 1000);
            tura.setText("Колва тонн = " + tonn);

        } catch (NumberFormatException e) {
            tura.setText("Ведите коректное число ");
        }
    }
}


