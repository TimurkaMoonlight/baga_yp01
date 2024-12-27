module ru.gilyazov.gilyazov_example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.bagabiev.bagabiev_example to javafx.fxml;
    exports ru.bagabiev.bagabiev_example;
    exports ru.bagabiev.bagabiev_example.controller;
    opens ru.bagabiev.bagabiev_example.controller to javafx.fxml;
}