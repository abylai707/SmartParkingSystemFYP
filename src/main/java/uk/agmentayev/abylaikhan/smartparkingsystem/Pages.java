package uk.agmentayev.abylaikhan.smartparkingsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * class intentended fo keepeng all javafx forms in program
 */
public class Pages {

    private static final String LoginFXML = "login-page.fxml";
    private static final String MenuFXML = "menu-page.fxml";

    //todo initialization by static init blocks instead of readPages()
    public static Scene login;
    public static Scene menu;

    static { // static initializung block
        try {
            FXMLLoader fxmlLoader;
            fxmlLoader = new FXMLLoader(SmartParkingApplication.class.getResource(LoginFXML));
            login = new Scene(fxmlLoader.load(), 640, 480);

            fxmlLoader = new FXMLLoader(SmartParkingApplication.class.getResource(MenuFXML));
            menu = new Scene(fxmlLoader.load(), 640, 480);

            System.out.println("Forms read!");
        } catch (IOException e) {
            System.out.println("Error loading FXML form: " + e.getMessage());
            System.exit(1);
        }
    }

    static Stage stage;
    public static void setStage(Stage s) {
        stage = s;
    }

    public static void switchScene(Scene scene) {
        stage.setTitle("Smart Parking System");
        stage.setScene(scene);
        stage.show();
    }

    public static void showErrDialogue(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
