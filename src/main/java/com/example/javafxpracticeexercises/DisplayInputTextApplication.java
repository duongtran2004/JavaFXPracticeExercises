package com.example.javafxpracticeexercises;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class DisplayInputTextApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        //set tittle for the stage
        primaryStage.setTitle("Input Your Name Form");
        // TextFields
        TextField firstName = new TextField("First Name");
        TextField lastName = new TextField("Last Name");
        // labels
        Label firstNameLabel = new Label("First Name");
        Label lastNameLabel = new Label("Last Name");
        // set labels for
        firstNameLabel.setLabelFor(firstName);
        lastNameLabel.setLabelFor(lastName);
        //set prompt text
        firstName.setPromptText("First Name");
        lastName.setPromptText("Last Name");


//        // setMnemonic
//        firstNameLabel.setMnemonicParsing(true);
//        lastNameLabel.setMnemonicParsing(true);

        //add button
        Button submitButton = new Button("Click to Submit your Info");





        //Event Handling
        // Set an action when the button is clicked.
        submitButton.setOnAction(event -> {
            // You can choose to either display an alert:
            showAlert("Button Clicked", "You have submitted your information !");

        });
        // create a Tile pane
        TilePane rootTilePane = new TilePane();
        //add UI elements to the root pane
        rootTilePane.getChildren().addAll(firstNameLabel, firstName, lastNameLabel, lastName, submitButton);
        // create a scene
        Scene scene = new Scene(rootTilePane, 200, 200);

        // set the scene for the stage
        primaryStage.setScene(scene);
//show the stage
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

