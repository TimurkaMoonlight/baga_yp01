package ru.bagabiev.bagabiev_task1_1912;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost1 {

    @FXML
    private Label Result;

    @FXML
    private TextField aText;

    @FXML
    private Button checkButton;

    @FXML
    void buttonOnAcion(ActionEvent event) {
        try {
            int number = Integer.parseInt(aText.getText());
            if (number % 10 == 7) {
                Result.setText("Число оканчивается на 7");
            } else {
                Result.setText("Число не оканчивается на 7");
            }
        } catch (NumberFormatException e) {
            Result.setText("Введите корректное целое число");
        }
    }
}




