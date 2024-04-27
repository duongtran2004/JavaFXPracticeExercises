module com.example.javafxpracticeexercises {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxpracticeexercises to javafx.fxml;
    exports com.example.javafxpracticeexercises;
}