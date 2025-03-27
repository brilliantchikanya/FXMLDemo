package com.bullet.fxmldemo;

import com.bullet.fxmldemo.models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML private TextField tf_username;
    @FXML private PasswordField tf_password;
    @FXML private Button btn_login;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn_login.setOnAction(event -> onLogin());
                //Model.getInstance().getViewFactory().showMainWindow());
    }

    private void onLogin() {
        System.out.println("Log in button clicked...");
        // before we login the user, we have to close the login window first
        // for that we need to get the stage object
        Stage stage = (Stage) tf_password.getScene().getWindow();
        stage.close();
        // then we can login the user
        Model.getInstance().getViewFactory().showMainWindow();
        //Model.getInstance().getViewFactory().getDashBoardView();
    }
}