package ru.bagabiev.bagabiev_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField elementNumberField;

    @FXML
    private TextField elementValueField;

    @FXML
    private Label resultLabel;

    @FXML
    void Button(ActionEvent event) {
        try {
            int elementNumber = Integer.parseInt(elementNumberField.getText());
            double elementValue = Double.parseDouble(elementValueField.getText());

            if (elementNumber < 1 || elementNumber > 4) {
                resultLabel.setText("Неверный номер элемента (1-4)");
                showAlert("Ошибка", "Введите корректный номер элемента (1-4).");
                return;
            }
            double[] results = calculateElements(elementNumber, elementValue);

            if (results == null) {
                resultLabel.setText("Не удалось вычислить элементы");
                showAlert("Ошибка", "Ошибка в вычислениях.");
            } else{
                resultLabel.setText(String.format("a=%.2f, c=%.2f, h=%.2f, S=%.2f",
                        results[0], results[1], results[2], results[3]));
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Неверный формат ввода");
            showAlert("Ошибка", "Введите корректные числовые значения.");
        }
    }

    private void showAlert(String ошибка, String s) {
    }


    private double[] calculateElements(int elementNumber, double elementValue) {
        double a, c, h, s;

        switch (elementNumber) {
            case 1: // Катет a
                a = elementValue;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 2: // Гипотенуза c
                c = elementValue;
                a = c / Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;
            case 3: // Высота h
                h = elementValue;
                c = 2 * h;
                a = c / Math.sqrt(2);
                s = c * h / 2;
                break;
            case 4: // Площадь S
                s = elementValue;
                c = Math.sqrt(s * 4);
                h = c / 2;
                a = c / Math.sqrt(2);

                break;
            default:
                return null;
        }

        return new double[] {a, c, h, s};
    }
}



