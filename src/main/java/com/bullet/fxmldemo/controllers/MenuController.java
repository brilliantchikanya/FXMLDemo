package com.bullet.fxmldemo.controllers;

import com.bullet.fxmldemo.models.Model;
import com.bullet.fxmldemo.views.MenuOptions;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML private Button btn_logout;
    @FXML private Button btn_exit;
    @FXML private Button btn_dashboard;
    @FXML private Button btn_employees;
    @FXML private Button btn_benefits;
    @FXML private Button btn_deductions;
    @FXML private Button btn_reports;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        addListeners();

    }

    private void addListeners() {
        btn_dashboard.setOnAction(event -> onDashboard());
    }

    public void onDashboard() {
        // set the selected menu option so that it will be picked by the
        // listener, which will fire the operation to swith scenes.
        Model.getInstance().getViewFactory().getSelectedMenuOption().set(MenuOptions.DASHBOARD);
        // this will be handled in the main-window controller, which listens
        // to changes in the selected menu option
        //Model.getInstance().getViewFactory().showMainWindow();
    }

    private void onLogout() {
        // close the window then go to the login window

    }

    private void onExit() {
        //exit the application
    }
        // }

    private void onEmployees() {
        Model.getInstance().getViewFactory().getSelectedMenuOption().set(MenuOptions.EMPLOYEE);
    }

    private void onBenefits() {
        Model.getInstance().getViewFactory().getSelectedMenuOption().set(MenuOptions.BENEFITS);
    }

    private void onDeductions() {
        Model.getInstance().getViewFactory().getSelectedMenuOption().set(MenuOptions.DEDUCTIONS);
    }

    private void onReports() {
        Model.getInstance().getViewFactory().getSelectedMenuOption().set(MenuOptions.REPORTS);
    }

}
