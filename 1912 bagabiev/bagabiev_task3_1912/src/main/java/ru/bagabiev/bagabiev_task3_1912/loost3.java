package ru.bagabiev.bagabiev_task3_1912;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost3 {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private TextField cText;

    @FXML
    private Label result;

    @FXML
    void button(ActionEvent event) {
        try {
            int num1 = Integer.parseInt(aText.getText());
            int num2 = Integer.parseInt(bText.getText());
            int num3 = Integer.parseInt(cText.getText());

            if (num1 == num2) {
                result.setText("Порядковый номер отличного числа: 3");
            } else if (num1 == num3) {
                result.setText("Порядковый номер отличного числа: 2");
            } else if (num2 == num3) {
                result.setText("Порядковый номер отличного числа: 1");
            } else {
                result.setText("Ошибка: Все числа разные");
                result.setText("ВСЕ ВЕРНО");
            }
        } catch (NumberFormatException e) {
            result.setText("Ошибка: Введите целые числа");
        }
    }
}




