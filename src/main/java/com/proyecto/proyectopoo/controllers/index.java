package com.proyecto.proyectopoo.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class index {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}