package ru.bagabiev.bagabiev_task2_1912;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost2 {

    @FXML
    private TextField aText;

    @FXML
    private Label result;

    @FXML
    void Button(ActionEvent event) {
        double number = Double.parseDouble(aText.getText().toString());
        double res;

        if(number > 0){
            res = number - 8;
        } else {
            res = number + 6;
        }
        result.setText("Результат:" + res);

    }

}
