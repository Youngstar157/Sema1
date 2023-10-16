module com.example.semen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.semen to javafx.fxml;
    exports com.example.semen;
}