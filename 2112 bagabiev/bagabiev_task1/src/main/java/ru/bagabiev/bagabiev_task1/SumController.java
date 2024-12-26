package ru.bagabiev.bagabiev_task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class SumController {

    @FXML
    private TextField aT;

    @FXML
    private Button hB;

    @FXML
    private Button jab;

    @FXML
    private ListView<Integer> nelist;

    @FXML
    private Label net;

    @FXML
    private Button nok;


    @FXML
    void hV(ActionEvent event) {
        if (aT.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(aT.getText().trim());
            if (x != 0) {
                nelist.getItems().add(x);
            }
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введите корректное число");
            alert.showAndWait();
        }
    }


    @FXML
    void jab(ActionEvent event) {
        List<Integer> data = nelist.getItems();
        int count = 0;

        for (int num : data) {
            if (num % 5 == 0 || num % 9 == 0) {
                count++;
            }
        }

        net.setText("Количество: " + count);
    }


    @FXML
    void nok(ActionEvent event) {
        Platform.exit();
    }
}
