package ru.bagabiev.bagabiev_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost5 {

    @FXML
    private TextField bText;

    @FXML
    private TextField pText;

    @FXML
    private Label result;

    @FXML
    void button(ActionEvent event) {
        try {
            double b = Double.parseDouble(bText.getText());
            double p = Double.parseDouble(pText.getText());

            double a = Math.cos(b) + 5.1 * Math.pow(10, -3);

            double w = Math.sqrt(a * b) + Math.tan(b);

            if (Double.isNaN(w)) {
                result.setText("Ошибка: Значение под квадратным корнем или tg(b) не определены");
                return;
            }

            double v = Math.exp(a * w) + p;

            result.setText("Результат: " + v);
        } catch (NumberFormatException e) {
            result.setText("Ошибка: Некорректный ввод чисел");
        }
    }
}

