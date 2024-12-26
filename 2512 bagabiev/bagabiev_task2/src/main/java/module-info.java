module ru.bagabiev.bagabiev_task {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task1 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task1;
    exports ru.bagabiev.bagabiev_task1.controller;
    opens ru.bagabiev.bagabiev_task1.controller to javafx.fxml;
}