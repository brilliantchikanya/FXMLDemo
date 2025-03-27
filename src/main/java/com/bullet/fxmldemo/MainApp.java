package com.bullet.fxmldemo;

import com.bullet.fxmldemo.models.Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxmls/login.fxml"));
        Model.getInstance().getViewFactory().showLoginWindow();


    }


    public static void main(String[] args) {
        launch();
    }
}