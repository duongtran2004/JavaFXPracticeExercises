package com.example.javafxpracticeexercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class ColorCheckBoxApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //create label
        Label label = new Label("Please choose your background color: ");
        //create check boxes
        CheckBox redCheckBox = new CheckBox("red");
        CheckBox blueCheckBox = new CheckBox("blue");
        CheckBox greenCheckBox = new CheckBox("green");


        // Create an HBox to hold the content
        HBox contentBox = new HBox();
        contentBox.setSpacing(10); // Set spacing between elements
        contentBox.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null))); // Set initial background color
        contentBox.getChildren().addAll(label, redCheckBox, blueCheckBox, greenCheckBox);

        // Event Handling
        redCheckBox.setOnAction(event -> updateBackgroundColor(contentBox, redCheckBox.isSelected() ? Color.RED : null));
        blueCheckBox.setOnAction(event -> updateBackgroundColor(contentBox, blueCheckBox.isSelected() ? Color.BLUE : null));
        greenCheckBox.setOnAction(event -> updateBackgroundColor(contentBox, greenCheckBox.isSelected() ? Color.GREEN : null));

        // Create a scene
        Scene scene = new Scene(contentBox);

        // Set the scene for the stage
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }

    // Helper method to update the background color of the HBox
    private void updateBackgroundColor(HBox box, Color color) {
        if (color != null) {
            box.setBackground(new Background(new BackgroundFill(color, null, null)));
        } else {
            box.setBackground(null); // Clear background
        }
    }
}
