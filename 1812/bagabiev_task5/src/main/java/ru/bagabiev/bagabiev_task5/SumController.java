package ru.bagabiev.bagabiev_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField GodTextField;

    @FXML
    private Label VekLabel;

    @FXML
    private Button Vivod;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int God = Integer.parseInt(GodTextField.getText().toString());
        int Vek;
        if (God % 100 == 0){
            Vek = God / 100;
        }else {
            Vek = God / 100 + 1;
        }
        VekLabel.setText("Номер столетия: " +Vek);
    }

}
