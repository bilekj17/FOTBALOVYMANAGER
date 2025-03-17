module com.example.fotbalovydraft {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fotbalovydraft to javafx.fxml;
    exports com.example.fotbalovydraft;
}