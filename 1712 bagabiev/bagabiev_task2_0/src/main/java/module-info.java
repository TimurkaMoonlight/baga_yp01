module ru.bagabiev.bagabiev_task2_0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task2_0 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task2_0;
}