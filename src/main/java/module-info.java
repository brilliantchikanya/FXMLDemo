module com.bullet.fxmldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bullet.fxmldemo to javafx.fxml;
    exports com.bullet.fxmldemo;
    exports com.bullet.fxmldemo.controllers;
    opens com.bullet.fxmldemo.controllers to javafx.fxml;
}