package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;


import java.util.EventObject;

import static javafx.application.Application.launch;

public class HelloController {
    public Button start;
    GridPane gridPane = new GridPane();
    Button[] button = new Button[7];
    VBox[] vBox = new VBox[7];
    Circle[] circle = new Circle[42];
    int row1 = 7;


    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            Node source = (Node)e.getSource();
            System.out.println(source);
            int row = GridPane.getRowIndex(source);
            int col = GridPane.getColumnIndex(source);
            Circle circle1 = new Circle(40, Color.YELLOW);

            gridPane.add(circle1, col, row1);
            for (Node node : gridPane.getChildren()) {
                int nodeCol = GridPane.getColumnIndex(node);
                int rowCol = GridPane.getRowIndex(node);
            }


        }
    };


    @FXML
    public void initialize() {
        System.out.println("start");
        gridPane.setGridLinesVisible(false);



        int k = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 1) {
                    button[k] = new Button("Click");
                    vBox[k] = new VBox();
                    vBox[k].setAlignment(Pos.CENTER);
                    button[k].setPrefSize(70, 30);
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
                circle[k].addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

            }
            System.out.println("Hallo");
        }


    }




        private void mouseClicked(MouseEvent e) {
        Node source = (Node)e.getSource() ;
        Integer colIndex = GridPane.getColumnIndex(source);
        Integer rowIndex = GridPane.getRowIndex(source);
        System.out.printf("Mouse entered cell [%d, %d]%n", colIndex, rowIndex);
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