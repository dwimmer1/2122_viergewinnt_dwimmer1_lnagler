package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


import java.awt.*;
import java.io.IOException;
import java.util.Objects;

import static javafx.application.Application.launch;

public class HelloController {
    GridPane gridPane = new GridPane();


    @FXML
    public void initialize() {
        System.out.println("start");
        gridPane.setGridLinesVisible(true);
        //gridPane.setOnMouseClicked(clickGrid();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                //Circle circle = new Circle(40, Color.WHITE);
                Circle circle = new Circle(40, Color.WHITE);
                Pane pane = new Pane();
                pane.setStyle("-fx-background-color: blue");
                gridPane.add(pane, j, i);
                gridPane.add(circle, j, i);
            }
            System.out.println("Hallo");
        }
    }


    public void startButton(ActionEvent actionEvent) {
        Stage stage = new Stage();
        StackPane root = new StackPane();
        root.getChildren().add(gridPane);

        Scene scene = new Scene(root, 480, 480);

        stage.setTitle("Vier-Gewinnt");
        stage.setScene(scene);
        stage.show();
    }
}