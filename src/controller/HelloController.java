package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class HelloController {
    GridPane gridPane = new GridPane();


    public Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            int nodeCol = GridPane.getColumnIndex(node);
            int rowCol = GridPane.getRowIndex(node);
            if (nodeCol == col && rowCol == row) {
                return node;
            }
        }
        return null;
    }


    @FXML
    public void initialize() {
        System.out.println("start");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("\nZeile" + i + "Spalte" + j);
                Circle circle = new Circle(40, Color.WHITE);
                Pane pane = new Pane();
                pane.setStyle("-fx-background-color: blue");
                gridPane.add(pane,j,i);
                gridPane.add(circle, j, i);
            }


        }
    }
}

