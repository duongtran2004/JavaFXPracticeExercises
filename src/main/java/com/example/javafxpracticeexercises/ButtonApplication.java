package com.example.javafxpracticeexercises;
//import necessary stuffs

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ButtonApplication extends Application { //every JavaFX Application must extend the Application Class
    @Override
    public void start(Stage primaryStage) throws Exception {
        //add a control (control in this case is a button)
        Button button1 = new Button("Click Me");
        //define the layout (why root?)
        HBox rootLayout = new HBox();
        //we need to add our control
        rootLayout.getChildren().add(button1);
        //add this layout to the scene
        Scene scene = new Scene(rootLayout);
        //we need to add this scene to stage
        primaryStage.setScene(scene);

        //Event Handling
        // Set an action when the button is clicked.
        button1.setOnAction(event -> {
            // You can choose to either display an alert:
            showAlert("Button Clicked", "You clicked the button!");

            // OR change the button text:
            // actionButton.setText("Clicked!");
        });


        // Set the title of the window.
        primaryStage.setTitle("Button Action App");

        // Show the window.
        primaryStage.show();
    }


    // Helper method to show an alert dialog.
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    }

