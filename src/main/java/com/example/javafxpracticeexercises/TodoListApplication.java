package com.example.javafxpracticeexercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicReference;

public class TodoListApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //set tittle
        stage.setTitle("TodoList");
        //create  labels
        Label labelToInputTask = new Label("Please enter your tasks: ");
        TextField textFieldToInputTask = new TextField("Task(s)");
        Button submitTaskButton = new Button("Submit");


        Label labelToShowTodoList = new Label("This is your to-do list ");

        Button emptyAllListButton = new Button("Empty all to-do list");

// Declare a variable to hold the user input
        //create a VBox
        VBox root = new VBox();
        //add all UI to VBox
        root.getChildren().addAll(labelToInputTask, textFieldToInputTask, submitTaskButton, labelToShowTodoList, emptyAllListButton);
        //set Vbox as scene to stage
        stage.setScene(new Scene(root));
        //Event handling
        emptyAllListButton.setOnAction(event -> {

            root.getChildren().clear();
            //add all UI to VBox
            root.getChildren().addAll(labelToInputTask, textFieldToInputTask, submitTaskButton, labelToShowTodoList ,emptyAllListButton  );
        });

        // Set up an event handler for when the user presses Enter in the text field
       submitTaskButton.setOnAction(event -> {
            // Capture the user-entered text
            String userInput = textFieldToInputTask.getText();
           CheckBox checkBox = new CheckBox(userInput);
           //add checkBox to VBox
           root.getChildren().addAll(checkBox);

           // Event handling for checkbox
           checkBox.setOnAction(checkEvent -> {
               if (checkBox.isSelected()) {
                   // Apply strikethrough style to the label when checkbox is selected
                   checkBox.setStyle("-fx-strikethrough: true;");
               } else {
                   // Remove strikethrough style when checkbox is deselected
                   checkBox.setStyle("-fx-strikethrough: false;");
               }
           });
           root.getChildren().add(checkBox); // Add the checkbox to the VBox
           textFieldToInputTask.clear(); // Clear the text field after adding the task
        });



        //show stage
        stage.show();
        //helper method to get input from user in the textbox and convert to String

        //helper method to convert String to checkboxes
        //helper method to cross out text when checkboxes are ticked (event handling)
    }

   }
