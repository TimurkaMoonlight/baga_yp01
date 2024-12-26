package ru.bagabiev.bagabiev_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aT;

    @FXML
    private TextField bT;

    @FXML
    private Label otvet;

    @FXML
    void btn(ActionEvent event) {

        int A = Integer.parseInt(aT.getText());
        int B = Integer.parseInt(bT.getText());


        if (A >= B) {
            otvet.setText("Ошибка: A должно быть меньше B.");
            return;
        }


        StringBuilder result = new StringBuilder();
        int count = 0;


        for (int i = B - 1; i > A; i--) {
            result.append(i).append(" ");
            count++;
        }


        if (count > 0) {
            result.append("\nКоличество чисел: ").append(count);
            otvet.setText(result.toString());
        } else {
            otvet.setText("Нет чисел между A и B.");
        }
    }
}
