package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.Button;


import javax.xml.transform.Source;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

import static javafx.application.Application.launch;

public class HelloController {
    public Button start;
    GridPane gridPane = new GridPane();
    AnchorPane anchor = new AnchorPane();
    Button[] button = new Button[7];
    VBox[] vBox = new VBox[7];
    Circle[] circle = new Circle[42];

    @FXML
    public void initialize() {
        System.out.println("start");
        gridPane.setGridLinesVisible(false);

        //gridPane.setOnMouseClicked(clickGrid();
        int k = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 1){
                    button[k] = new Button("Click");
                    vBox[k] = new VBox();
                    vBox[k].setAlignment(Pos.CENTER);
                    button[k].setPrefSize(70,30);
                    vBox[k].getChildren().add(button[k]);
                    gridPane.add(vBox[k], j, 0);
                    k++;
                }
                //Circle circle = new Circle(40, Color.WHITE);
                circle[k] = new Circle(40, Color.WHITE);
                Pane pane = new Pane();
                pane.setStyle("-fx-background-color: blue");
                gridPane.add(pane, j, i);
                gridPane.add(circle[k], j, i);

            }
            System.out.println("Hallo");
        }
    }

    public void MouseEvent(){
        for (Node source: gridPane.getChildren()){
            int col = GridPane.getColumnIndex(source);
            int row = GridPane.getRowIndex(source);
            System.out.println(col + row);
        }
    }

    //Wenn startButton gedrückt wird, wird das Gamefield-Fenster geöffnet.
    public void startButton(ActionEvent actionEvent) {
        System.out.println("Hallo");
        Stage stage = new Stage();
        StackPane root = new StackPane();
        root.getChildren().add(gridPane);

        Scene scene = new Scene(root);

        stage.setTitle("Vier-Gewinnt");
        stage.setScene(scene);
        stage.show();
    }
}