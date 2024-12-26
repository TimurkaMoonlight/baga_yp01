package ru.bagabiev.bagabiev_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
public class summaControl {

    @FXML
    private Label ResultLabel;
    @FXML
    private TextField aTextFeild;

    @FXML
    private TextField bTextFeild;

    @FXML
    void sumButtonOnArcion(ActionEvent event) {
        float a = Float.parseFloat(aTextFeild.getText().toString());
        float b = Float.parseFloat(bTextFeild.getText().toString());
        ResultLabel.setText("S = "+ (a + b ));

    }

}
