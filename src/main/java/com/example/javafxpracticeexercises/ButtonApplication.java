package com.example.javafxpracticeexercises;
//import necessary stuffs

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class ButtonApplication extends Application { //every JavaFX Application must extend the Application Class
    @Override
    public void start(Stage primaryStage) throws Exception {
        //add a control (control in this case is a button)
        Button button1 = new Button("Click Me");
        //define the layout (why root?)
        HBox root = new HBox();
        //we need to add our control
        root.getChildren().add(button1);
        //add this layout to the scene
        Scene scene = new Scene(root);
        //we need to add this scene to stage
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
