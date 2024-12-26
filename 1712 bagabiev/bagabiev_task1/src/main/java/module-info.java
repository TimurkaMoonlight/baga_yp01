module ru.bagabiev.bagabiev_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task1 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task1;
}