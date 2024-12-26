package ru.bagabiev.bagabiev_task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label digitCountOutput;

    @FXML
    private Label digitSumOutput;

    @FXML
    private TextField numberInput;

    @FXML
    void Button(ActionEvent event) {
        try{
            int number = Integer.parseInt(numberInput.getText());
            if (number <= 0){
                digitCountOutput.setText("Некорректный ввод");
                digitSumOutput.setText("Некорректный ввод");
                return;
            }

            int count = 0;
            int sum = 0;
            int temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                count++;
                temp = temp / 10;
            }
            digitCountOutput.setText(String.valueOf(count));
            digitSumOutput.setText(String.valueOf(sum));

        } catch (NumberFormatException e){
            digitCountOutput.setText("Некорректный ввод");
            digitSumOutput.setText("Некорректный ввод");
        }
    }

}



