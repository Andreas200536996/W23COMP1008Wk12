module com.example.w23comp1008wk12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23comp1008wk12 to javafx.fxml;
    exports com.example.w23comp1008wk12;
}