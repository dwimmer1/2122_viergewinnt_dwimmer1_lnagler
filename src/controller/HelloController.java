package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import modell.Player;


import java.util.Objects;

import static javafx.application.Application.launch;

public class HelloController {
    public TextField player1name;
    public TextField player2name;
    Player player1 = new Player();
    Player player2 = new Player();
    public Button start;
    GridPane gridPane = new GridPane();
    Button[] button = new Button[7];
    VBox[] vBox = new VBox[7];
    Circle[] circle = new Circle[42];
    Alert alert = new Alert(Alert.AlertType.NONE);
    int row1 = 7;


    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        //Wenn auf das Gridpane geclickt wird, wird diese Methode aufgerufen
        public void handle(MouseEvent e) {
            Node source = (Node) e.getSource();
            System.out.println(source);
            int row = GridPane.getRowIndex(source);
            int col = GridPane.getColumnIndex(source);
            Circle circle1 = new Circle(40, Color.YELLOW);

            //gridPane.add(circle1, col, row1);
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

    //Wenn startButton gedrückt wird, wird das Gamefield-Fenster geöffnet.
    public void startButton(ActionEvent actionEvent) {
        // Diese if fragt ob das Textfield dem Playernamen entspricht wenn Nein wird ein alert ausgegeben
        if (Objects.equals(player1name.getText(), player1.getName()) && Objects.equals(player2name.getText(), player2.getName())) {
            System.out.println(player1.getName());
            System.out.println(player2.getName());
            Stage stage = new Stage();
            StackPane root = new StackPane();
            root.getChildren().add(gridPane);

            Scene scene = new Scene(root);

            stage.setTitle("Vier-Gewinnt");
            stage.setScene(scene);
            stage.show();
        } else {
            //ruft eine Methode auf die einen alert ausgibt
            sameName(1);
        }
    }
    //Wenn Textfield benutzt wird, wird diese Methode aufgerufen
    public void setName(ActionEvent actionEvent) {
        //player 1 Name wird angelegt
        player1.setName(player1name.getText());
        //player 2 Name wird angelegt
        player2.setName(player2name.getText());
        //Prüft ob der Name gleich ist in dem Module Player
        if (Player.rv) {
            //Textfield Texte werden gelöscht
            player1name.clear();
            player2name.clear();
            //ruft eine Methode auf die einen alert ausgibt
            sameName(0);
        }
    }

    public void sameName(int i) {
        if (i == 0) {                       //Wenn zwei gleiche Namen eingegeben werden wird 0 mitgegeben
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Es kann nicht der gleiche Name verwendet werden");
            alert.show();
        }else if (i == 1){                  //Wenn kein Name eingegeben wurde wird 1 mitgegeben
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Es wurden keine Namen eingegeben");
            alert.show();
        }
    }
}