package com.proyecto.proyectopoo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader inicio = new FXMLLoader(App.class.getResource("index.fxml"));
        FXMLLoader login = new FXMLLoader(App.class.getResource("login.fxml"));
        FXMLLoader register = new FXMLLoader(App.class.getResource("register.fxml"));
        FXMLLoader navLat = new FXMLLoader(App.class.getResource("navLat.fxml"));

        Scene ventana = new Scene(inicio.load(), 320, 240);
        stage.setTitle("Mi app");
        stage.setScene(ventana);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}