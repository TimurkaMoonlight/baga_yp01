module ru.bagabiev.bagabiev_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task6 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task6;
}