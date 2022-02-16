package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import modell.Conditions;
import modell.Player;
import modell.PlayerSwitch;
import modell.Stone;


import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.String.valueOf;
import static javafx.application.Application.launch;

public class HelloController {
    public TextField player1name;
    public TextField player2name;
    public ColorPicker player1color;
    public ColorPicker player2color;
    public TextField change1name;
    public TextField change2name;
    Player player1 = new Player();
    Player player2 = new Player();
    Stone stone1 = new Stone();
    Stone stone2 = new Stone();
    Conditions c = new Conditions();
    public Button start;
    Button restart = new Button();
    Button menu = new Button();
    GridPane gridPane = new GridPane();
    Circle[][] circle = new Circle[6][7];
    Alert alert = new Alert(Alert.AlertType.NONE);
    HBox hBox = new HBox();
    VBox vBox = new VBox();
    VBox vbox1 = new VBox();
    boolean running = true;
    int currentPlayer = 0;
    String[][] field = new String[6][7];
    PlayerSwitch playerSwitch = new PlayerSwitch();


    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
        @Override
        //Wenn auf das Gridpane geclickt wird, wird diese Methode aufgerufen
        public void handle(MouseEvent e) {
            Node source = (Node) e.getSource();
            System.out.println(source);
            int col = GridPane.getColumnIndex(source);
            int row = GridPane.getRowIndex(source);
            String color;
            char symbol;
            try {
                    System.out.println("ich hvhagsvdhgvjhdFSdfguhDVGUdv");
                    running = true;

                    if (col <= 7) {
                        if (currentPlayer == 1) {
                            color = stone1.getColor();
                            symbol = 'X';
                        } else {
                            color = stone2.getColor();
                            symbol = 'O';
                        }

                        //von unten nach oben

                        for (int b = 7 - 2; b >= 0; b--) {
                            //setzt 0 wenn String # ist
                            System.out.println(source);
                            if (circle[row][col].getFill() == circle[b][col].getFill()) {
                                System.out.println("Hallo");
                                while (running) {
                                    circle[b][col] = new Circle(40, Color.valueOf(color));
                                    gridPane.add(circle[b][col], col, b);
                                    field[b][col] = valueOf(symbol);
                                    currentPlayer = playerSwitch.nextPlayer(currentPlayer);
                                    String stringSymbol = String.valueOf(symbol);
                                    running = false;
                                    boolean checkWin = c.win(field, stringSymbol);
                                    System.out.println(Arrays.deepToString(field));
                                    System.out.println(circle[b]);
                                    if (checkWin){
                                        alert(4);
                                        gridPane.setDisable(true);
                                    }
                            }
                        }
                    }
                }
            } catch (
                    Exception t) {
                t.printStackTrace();
            }


            System.out.println(player1.getName());
        }
    };

    @FXML
    public void initialize() {
        menu.setText("Menü");
        restart.setText("Restart");
        menu.setStyle("-fx-font-size: 14px");

        int k = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                //Circle circle = new Circle(40, Color.WHITE);
                circle[i][j] = new Circle(40, Color.WHITE);
                Pane pane = new Pane();
                pane.setStyle("-fx-background-color: blue");
                gridPane.add(pane, j, i);
                gridPane.add(circle[i][j], j, i);
                //Wenn auf einen Circle geklickt wird, wird der Eventhandler aufgerufen
                circle[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
                k++;
            }
            System.out.println("Hallo");
        }


    }

    //Wenn startButton gedrückt wird, wird das Gamefield-Fenster geöffnet.
    public void startButton(ActionEvent actionEvent) {
        //Diese if-Abfrage checkt ob das Textfield dem Playernamen entspricht wenn Nein wird ein alert ausgegeben
        if (Objects.equals(player1name.getText(), player1.getName()) && Objects.equals(player2name.getText(), player2.getName())) {
            //Diese if-Abfrage checkt ob die ausgewählt Farbe der Spielstein Farbe entspricht
            if (Objects.equals(String.valueOf(player1color.getValue()), stone1.getColor()) && Objects.equals(String.valueOf(player2color.getValue()), stone2.getColor())) {
                Stage stage = (Stage) start.getScene().getWindow();
                stage.close();
                vBox.getChildren().add(gridPane);
                vbox1.getChildren().add(menu);
                vbox1.getChildren().add(restart);
                hBox.getChildren().add(vBox);
                hBox.getChildren().add(vbox1);

                Stage stage1 = new Stage();
                StackPane root = new StackPane();
                root.getChildren().add(hBox);

                Scene scene = new Scene(root);

                stage1.setTitle("Vier-Gewinnt");
                stage1.setScene(scene);
                stage1.show();

                menu.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent x) {
                        initialize();
                        try {
                            FXMLLoader fxmlLoader = new FXMLLoader();
                            Pane root = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")).openStream());
                            Scene scene = new Scene(root, 600, 600);
                            stage.show();
                            stage.setScene(scene);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });

                restart.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                    }
                });

            } else {
                //ruft eine Methode auf die einen alert ausgibt
                alert(3);
            }
        } else {
            //ruft eine Methode auf die einen alert ausgibt
            alert(1);
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
            alert(0);
        }
    }

    //Wenn eine Farbe ausgewählt wird wird sie sofort gesetzt
    public void setColor(ActionEvent actionEvent) {
        stone1.setColor(String.valueOf(player1color.getValue()));
        System.out.println(stone1.getColor());
        stone2.setColor(String.valueOf(player2color.getValue()));
        System.out.println(stone2.getColor());
        //Überprüft ob zwei gleiche Farben ausgewählt wurden
        if (Stone.rv) {
            player1color.setValue(Color.WHITE);
            player2color.setValue(Color.WHITE);
            //ruft eine Methode auf die einen alert ausgibt
            alert(2);
        }
    }

    public void alert(int i) {
        if (i == 0) {                       //Wenn zwei gleiche Namen eingegeben werden wird 0 mitgegeben
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Es kann nicht der gleiche Name verwendet werden");
            alert.show();
        } else if (i == 1) {                  //Wenn kein Name eingegeben wurde wird 1 mitgegeben
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Es wurden keine Namen eingegeben");
            alert.show();
        } else if (i == 2) {                   //Wenn zwei gleiche Farben eingegeben werden wird 2 mitgegeben
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Es dürfen nicht zwei gleiche Farben verwendet werden");
            alert.show();
        } else if (i == 3) {                   //Wenn keine Farbe eingegeben wurde wird 3 mitgegeben
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Es wurden keine Farben gewählt");
            alert.show();
        }else if (i == 4){
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Sie habe dieses Spiele gewonnen");
            alert.show();
        }
    }
}