module ru.bagabiev.bagabiev_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task2 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task2;
}