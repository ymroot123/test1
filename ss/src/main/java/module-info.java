module com.example.ss {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ss to javafx.fxml;
    exports com.example.ss;
}