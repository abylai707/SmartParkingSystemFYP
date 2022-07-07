package uk.agmentayev.abylaikhan.smartparkingsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SmartParkingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pages.setStage(stage);
        stage.setTitle("Smart Parking System");
        Pages.switchScene(Pages.login);
    }

    public static void main(String[] args) {
        Application.launch();
    }
}