module com.example.myd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.myd to javafx.fxml;
    exports com.example.myd;
}