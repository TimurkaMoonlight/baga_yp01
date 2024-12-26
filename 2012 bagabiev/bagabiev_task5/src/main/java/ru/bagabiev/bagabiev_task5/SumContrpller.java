package ru.bagabiev.bagabiev_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumContrpller {

    @FXML
    private Label daysOutput;

    @FXML
    private TextField percentageInput;

    @FXML
    private Label totalDistanceOutput;

    @FXML
    void Button(ActionEvent event) {
        try{
            double percentage = Double.parseDouble(percentageInput.getText());

            if (percentage <= 0 || percentage >= 50){
                daysOutput.setText("Некорректный ввод");
                totalDistanceOutput.setText("Некорректный ввод");
                return;
            }

            double currentDistance = 10.0;
            double totalDistance = 10.0;
            int days = 1;

            while (totalDistance <= 200) {
                days++;
                currentDistance = currentDistance * (1 + percentage / 100);
                totalDistance += currentDistance;
            }

            daysOutput.setText(String.valueOf(days));
            totalDistanceOutput.setText(String.format("%.2f", totalDistance));


        } catch(NumberFormatException e) {
            daysOutput.setText("Некорректный ввод");
            totalDistanceOutput.setText("Некорректный ввод");

        }
    }

}

