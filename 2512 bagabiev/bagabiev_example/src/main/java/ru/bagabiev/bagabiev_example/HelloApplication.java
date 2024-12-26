package ru.bagabiev.bagabiev_example;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.bagabiev.bagabiev_example.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       showMainStage(stage, "hello-view.fxml","Marathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}