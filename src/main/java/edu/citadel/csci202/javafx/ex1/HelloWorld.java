package edu.citadel.csci202.javafx.ex1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class HelloWorld extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        //Create a label
        Label message = new Label("Hello, world.");
        message.setFont(new Font(30));

        //Create a pane and add the label to the pane
        StackPane pane = new StackPane();
        pane.getChildren().add(message);

        //Create a scene and add the pane to the scene
        Scene scene = new Scene(pane, 300, 150);

        //Add the scene to the stage and display the stage
        stage.setScene(scene);
        stage.setTitle("Hello, world.");
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}