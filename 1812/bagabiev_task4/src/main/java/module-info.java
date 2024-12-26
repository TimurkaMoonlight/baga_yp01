module ru.bagabiev.bagabiev_task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task4 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task4;
}