package ru.bagabiev.bagabiev_task4_1912;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost4 {

    @FXML
    private TextField kText;

    @FXML
    private Label result;

    @FXML
    private TextField xText;

    @FXML
    void button(ActionEvent event) {
        try {
            double x = Double.parseDouble(xText.getText());
            int k = Integer.parseInt(kText.getText());
            double res = calculateY(x, k);
            result.setText("Результат: " + (Double.isNaN(res) ? "Не определено" : String.format("%.2f", res)));
        } catch (NumberFormatException e) {
            result.setText("Ошибка: Неверный ввод");
        }
    }
    private double calculateY(double x, int k) {
        if (k == 3) {
            return Math.sin(x) + 2;
        } else if (k == 20) {
            return Math.cos(x * x);
        } else if (k == 10 || k == 15) {
            return Math.tan(x) + Math.sin(x);
        } else {
            return Double.NaN;
        }
    }
}



