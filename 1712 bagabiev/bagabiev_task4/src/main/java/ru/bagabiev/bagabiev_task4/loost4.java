package ru.bagabiev.bagabiev_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost4 {

    @FXML
    private TextField aText;

    @FXML
    private TextField bText;

    @FXML
    private Label result;

    @FXML
    void Button(ActionEvent event) {
        try {

            double a = Double.parseDouble(aText.getText());
            double b = Double.parseDouble(bText.getText());

            if (a == 0) {
                result.setText("Коэффициент A не должен быть равен 0.");
                return;
            }

            double x = -b / a;

            result.setText("Решение: x = " + x);
        } catch (NumberFormatException e) {
            result.setText("Некорректный ввод чисел.");
        }
    }

}

