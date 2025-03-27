package com.bullet.fxmldemo.controllers;

import com.bullet.fxmldemo.models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML private Button btn_dashboard;
    public Button btn_employees;
    public Button btn_benefits;
    public Button btn_deductions;
    public Button btn_reports;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_dashboard.setOnAction(event -> onDashboard());

    }

    public void onDashboard() {
        System.out.println("Dashboard...");
        Model.getInstance().getViewFactory().showMainWindow();
    }


}
