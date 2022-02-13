package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.Charset;

import static controller.GameController.play;

public class HelloApplication extends Application {
    HelloController h = new HelloController();
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        StackPane root = new StackPane();
        root.getChildren().add(h.gridPane);
        h.initialize();

        Scene scene = new Scene(root, 600, 600);

        stage.setTitle("Pyramid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}