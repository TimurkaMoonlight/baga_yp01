package ru.bagabiev.bagabiev_task2_0;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class summButton {

    @FXML
    private Label russia;
    @FXML
    private TextField russiaText;

    @FXML
    private Button tarantina;

    @FXML
    private Label tatar;

    @FXML
    void onAction(ActionEvent event) {
        double A = Double.parseDouble(russiaText.getText());
        double area = A * A;
        tatar.setText("S = "+ area);

    }

}
