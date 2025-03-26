module com.example.artur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.artur to javafx.fxml;
    exports com.example.artur;
}