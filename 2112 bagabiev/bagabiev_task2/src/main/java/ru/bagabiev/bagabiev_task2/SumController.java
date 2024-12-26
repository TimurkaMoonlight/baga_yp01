package ru.bagabiev.bagabiev_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
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


    private final List<Integer> numbers = new ArrayList<>();


    @FXML
    void hV(ActionEvent event) {
        if (aT.getText().isEmpty()) {
            showAlert("Ошибка", "Введите число!", Alert.AlertType.ERROR);
            return;
        }

        try {
            int number = Integer.parseInt(aT.getText());
            if (number < 0 || number > 30000) {
                showAlert("Ошибка", "Число должно быть в диапазоне от 0 до 30000!", Alert.AlertType.ERROR);
                return;
            }


            numbers.add(number);
            nelist.getItems().add(number);


            aT.clear();
        } catch (NumberFormatException e) {
            showAlert("Ошибка", "Введите корректное число!", Alert.AlertType.ERROR);
        }
    }


    @FXML
    void jab(ActionEvent event) {
        if (numbers.isEmpty()) {
            net.setText("Нет чисел для анализа");
            return;
        }


        long count = numbers.stream()
                .filter(num -> num % 3 == 0 && num % 10 == 2)
                .count();

        net.setText("Количество чисел: " + count);
    }


    @FXML
    void nok(ActionEvent event) {
        System.exit(0);
    }


    private void showAlert(String title, String content, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

}
