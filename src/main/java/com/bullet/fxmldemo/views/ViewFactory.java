package com.bullet.fxmldemo.views;

import com.bullet.fxmldemo.controllers.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewFactory {
    private AnchorPane dashBoardView;
    private AnchorPane menuView;


    /****   */

    public void showMainWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxmls/main-window.fxml"));
        MainWindowController mainWindowController = new MainWindowController();
        loader.setController(mainWindowController);
        createStage(loader);
    }

    public void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.setTitle("PAYROLL APPLICATION");
        stage.show();

    }

    /***   */

    public AnchorPane getDashBoardView() {
        if (dashBoardView == null) {
            try {
                dashBoardView = new FXMLLoader(getClass().getResource("fxmls/dashboard.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dashBoardView;
    }


}
