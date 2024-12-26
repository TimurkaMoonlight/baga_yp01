package ru.bagabiev.bagabiev_task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField gradeField;

    @FXML
    private Label resultLabel;

    @FXML
    void Button(ActionEvent event) {
        try {
            int grade = Integer.parseInt(gradeField.getText());
            String description = getGradeDescription(grade);
            resultLabel.setText("Результат: " + description);

        } catch (NumberFormatException e) {
            resultLabel.setText("Неверный формат ввода");
            showAlert("Ошибка", "Пожалуйста, введите целое число.");
        }
    }

    private void showAlert(String ошибка, String s) {
    }


    private String getGradeDescription(int grade) {
        switch (grade) {
            case 1:
                return "плохо";
            case 2:
                return "неудовлетворительно";
            case 3:
                return "удовлетворительно";
            case 4:
                return "хорошо";
            case 5:
                return "отлично";
            default:
                return "ошибка";
        }
    }
}



