package com.example.javafxpracticeexercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class PasswordFieldsApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //the dummy data
        String correctUsername = "Duong";
        String correctPassword = "2004";
        //set tittle
        stage.setTitle("Password Fields");

        // User name TextFields
        TextField userNameTextField = new TextField("Username");
        //create password field
        PasswordField passwordField = new PasswordField();
        // labels
        Label userNameLabel = new Label("Username");
        Label passwordLabel = new Label("Password");
        // set labels
        userNameLabel.setLabelFor(userNameTextField);
        passwordLabel.setLabelFor(passwordField);
        //set prompt text
        userNameTextField.setPromptText("Username");
        passwordField.setPromptText("Password");
        //add button
        Button submitButton = new Button("Click to Submit your Info");

        //Event Handling
        // Set an action when the button is clicked.
        submitButton.setOnAction(event -> {
            // Capture the user-entered text
            String enteredUsername = userNameTextField.getText();
            String enteredPassword = passwordField.getText();

            // You can choose to either display an alert:
            showAlert("Info submitted! ","You have submitted your login credentials ! ");
            if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
                showAlert("Correct Info", "You have successfully submitted your login credentials ! ");
                System.exit(0);

            } else {
                showAlert("Wrong Info", "Please redo your login credential ! ");

            }

        });
        // create a Tile pane
        TilePane rootTilePane = new TilePane();
        //add UI elements to the root pane
        rootTilePane.getChildren().addAll(userNameLabel, userNameTextField, passwordLabel, passwordField, submitButton);
        // create a scene
        Scene scene = new Scene(rootTilePane, 200, 200);

        // set the scene for the stage
      stage.setScene(scene);
//show the stage
        stage.show();
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
