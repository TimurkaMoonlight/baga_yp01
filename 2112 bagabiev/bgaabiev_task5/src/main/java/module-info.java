module ru.bagabiev.bgaabiev_task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bagabiev.bgaabiev_task5 to javafx.fxml;
    exports ru.bagabiev.bgaabiev_task5;
}