package ru.bagabiev.bagabiev_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost2 {

    @FXML
    private Label Label;

    @FXML
    private TextField aText;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        try {


            int N = Integer.parseInt(aText.getText());
            int lastMinuteSeconds = N % 60;
            Label.setText("Секунд до нач ласт минуты" + lastMinuteSeconds);
        } catch (NumberFormatException e) {
            Label.setText("Введите целое число");


        }
    }
}
