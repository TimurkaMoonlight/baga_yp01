package ru.bagabiev.bagabiev_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField lengthAField;

    @FXML
    private TextField lengthBField;

    @FXML
    private Label resultLabel;

    @FXML
    void Button(ActionEvent event) {
        try {
            double a = Double.parseDouble(lengthAField.getText());
            double b = Double.parseDouble(lengthBField.getText());

            if (a <= 0 || b <= 0) {
                resultLabel.setText("Отрезки должны быть положительными");
                showAlert("Ошибка", "Длины отрезков должны быть положительными.");
                return;
            }

            if(a <= b) {
                resultLabel.setText("Отрезок A должен быть больше B");
                showAlert("Ошибка", "Длина отрезка A должна быть больше длины отрезка B.");
                return;
            }

            int count = calculateMaxSegments(a, b);
            resultLabel.setText("Результат: " + count);


        } catch (NumberFormatException e) {
            resultLabel.setText("Неверный формат ввода");
            showAlert("Ошибка", "Введите корректные числовые значения.");
        }
    }

    private void showAlert(String ошибка, String s) {
    }

    private int calculateMaxSegments(double a, double b) {
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        return count;
    }
}


