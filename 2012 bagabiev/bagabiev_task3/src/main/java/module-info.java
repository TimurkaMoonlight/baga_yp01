module ru.bagabiev.bagabiev_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task3 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task3;
}