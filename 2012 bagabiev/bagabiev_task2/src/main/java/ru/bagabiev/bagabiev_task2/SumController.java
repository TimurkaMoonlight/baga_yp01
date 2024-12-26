package ru.bagabiev.bagabiev_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField ageField;

    @FXML
    private Label resultLabel;

    @FXML
    void Button(ActionEvent event) {
        try {
            int age = Integer.parseInt(ageField.getText());
            if (age < 20 || age > 69) {
                resultLabel.setText("Недопустимый возраст (20-69)");
                showAlert("Ошибка", "Введите возраст в диапазоне 20-69");
                return;
            }
            String description = getAgeDescription(age);
            resultLabel.setText("Результат: " + description);

        } catch (NumberFormatException e) {
            resultLabel.setText("Неверный формат ввода");
            showAlert("Ошибка", "Пожалуйста, введите целое число.");
        }
    }

    private void showAlert(String ошибка, String s) {
    }

    private String getAgeDescription(int age) {
        int ones = age % 10;
        int tens = age / 10;

        String ageString;

        if (age >= 20 && age <= 29)
            ageString = "двадцать";
        else if (age >= 30 && age <= 39)
            ageString = "тридцать";
        else if (age >= 40 && age <= 49)
            ageString = "сорок";
        else if (age >= 50 && age <= 59)
            ageString = "пятьдесят";
        else
            ageString = "шестьдесят";

        String onesString = "";
        if (ones == 1 && age != 11) {
            onesString = "один";
        } else if (ones == 2 && age != 12) {
            onesString = "два";
        }
        else if (ones == 3 && age != 13) {
            onesString = "три";
        }
        else if (ones == 4 && age != 14) {
            onesString = "четыре";
        }
        else if (ones == 5 && age != 15) {
            onesString = "пять";
        }
        else if (ones == 6 && age != 16) {
            onesString = "шесть";
        }
        else if (ones == 7 && age != 17) {
            onesString = "семь";
        }
        else if (ones == 8 && age != 18) {
            onesString = "восемь";
        }
        else if (ones == 9 && age != 19) {
            onesString = "девять";
        }

        String yearsString;
        if ((ones == 1 && age != 11))
            yearsString = "год";
        else if ((ones >= 2 && ones <= 4 && (age < 12 || age > 14)))
            yearsString = "года";
        else
            yearsString = "лет";

        if (ones == 0)
            return ageString + " " + yearsString;

        if (age < 20){
            return  age + " " + yearsString;
        }

        return ageString + (onesString.isEmpty() ? "" : " " + onesString) + " " + yearsString;

    }
}


