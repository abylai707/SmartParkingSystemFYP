module uk.agmentayev.abylaikhan.smartparkingsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens uk.agmentayev.abylaikhan.smartparkingsystem to javafx.fxml;
    exports uk.agmentayev.abylaikhan.smartparkingsystem;
    exports uk.agmentayev.abylaikhan.smartparkingsystem.conrollers;
    opens uk.agmentayev.abylaikhan.smartparkingsystem.conrollers to javafx.fxml;
}