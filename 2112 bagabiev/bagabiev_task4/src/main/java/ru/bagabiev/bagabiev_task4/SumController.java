package ru.bagabiev.bagabiev_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField xT;

    @FXML
    private TextField nT;

    @FXML
    private Label otvet;

    @FXML
    void btn(ActionEvent event) {

        double X = Double.parseDouble(xT.getText());
        int N = Integer.parseInt(nT.getText());


        if (Math.abs(X) <= 1 && N >= 0) {
            otvet.setText("Ошибка: X должно быть меньше 1 и N должно быть больше 0.");
            return;
        }


        double result = 0;
        for (int k = 0; k < N; k++) {

            double term = Math.pow(-1, k) * Math.pow(X, 2 * k + 1) / (2 * k + 1);
            result += term;
        }


        otvet.setText(String.format("arctg=%.2f",result));
    }
}
