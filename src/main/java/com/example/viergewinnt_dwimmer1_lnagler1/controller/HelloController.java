package com.example.viergewinnt_dwimmer1_lnagler1.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public Label jack;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        jack.setText("Wimma do issa");
    }
}