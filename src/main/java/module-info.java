module com.example.moviestreamapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.moviestreamapplication to javafx.fxml;
    exports com.example.moviestreamapplication;
}