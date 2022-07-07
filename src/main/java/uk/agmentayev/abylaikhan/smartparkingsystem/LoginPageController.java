package uk.agmentayev.abylaikhan.smartparkingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController {
    @FXML
    private TextField userName;


    @FXML
    private Button buttonLogin;

    @FXML
    public void onLoginButtonAction() {
        //todo Read password list
        if (userName.getLength() <= 0) {
            Pages.showErrDialogue("You have entered wrong user name\nPlease enter valid user name");
            return;
        }

        Pages.switchScene(Pages.menu);

    }

}
