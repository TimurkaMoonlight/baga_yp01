package ru.bagabiev.bagabiev_task3_1812;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loost3 {

    @FXML
    private Label kRes;

    @FXML
    private TextField kText;

    @FXML
    void resOnAction(ActionEvent event) {
        int K = Integer.parseInt(kText.getText().toString());
        int b = K % 7;
        if (1 <= K&&K <= 365)
            switch (b) {
                case 0:
                    kRes.setText("День недели вторник ");
                    break;
                case 1:
                    kRes.setText("День недели среда ");
                case 2:
                    kRes.setText("День недели четверг ");
                    break;
                case 3:
                    kRes.setText("День недели пятница ");
                    break;
                case 4:
                    kRes.setText("День недели суббота ");
                    break;
                case 5:
                    kRes.setText("День недели воскресенье ");
                    break;
                case 6:
                    kRes.setText("День недели понедельник ");
                    break;
            }
        else
            kText.setText("Введите число попадающее под текущий год");



    }
}


