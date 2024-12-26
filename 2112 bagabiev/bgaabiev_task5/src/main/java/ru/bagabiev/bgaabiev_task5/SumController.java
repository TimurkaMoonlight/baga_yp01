package ru.bagabiev.bgaabiev_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nT;

    @FXML
    private Label otvet;

    @FXML
    void btn(ActionEvent event) {
        try {

            int n = Integer.parseInt(nT.getText());
            if (n <= 0) {
                otvet.setText("Введите натуральное число n > 0");
                return;
            }


            int[] b = new int[n + 1];
            b[1] = 1; // b_1 = 1
            int sum = 0;


            for (int k = 1; k <= n; k++) {
                if (k > 1) {
                    b[k] = 2 * k * k - 1 + b[k - 1];
                }
                int ak = k * k;
                sum += ak * b[k];
            }


            otvet.setText("Сумма: " + sum);
        } catch (NumberFormatException e) {
            otvet.setText("Ошибка: введите корректное число");
        }
    }
}
