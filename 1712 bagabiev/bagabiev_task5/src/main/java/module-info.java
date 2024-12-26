module ru.bagabiev.bagabiev_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bagabiev_task5 to javafx.fxml;
    exports ru.bagabiev.bagabiev_task5;
}