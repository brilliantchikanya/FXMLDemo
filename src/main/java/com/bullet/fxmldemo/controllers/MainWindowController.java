package com.bullet.fxmldemo.controllers;

import com.bullet.fxmldemo.models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    @FXML private BorderPane main_window;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory()
                .selectedMenuOptionProperty().addListener(
                        (observableValue,
                         oldVal,
                         newVal) ->
                        {
                            switch (newVal) {
                                case DASHBOARD -> main_window.setCenter(Model.getInstance().getViewFactory().getDashBoardView());
                                case EMPLOYEE -> main_window.setCenter(Model.getInstance().getViewFactory().getEmployeesView());
                                //case BENEFITS -> main_window.setCenter(Model.getInstance().getViewFactory().getDashBenefitsView());
                                default -> main_window.setCenter(Model.getInstance().getViewFactory().getDashBoardView());

                            }
                        });
    }


}
