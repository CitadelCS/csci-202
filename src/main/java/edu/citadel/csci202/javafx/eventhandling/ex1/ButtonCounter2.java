package edu.citadel.csci202.javafx.eventhandling.ex1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonCounter2 extends Application {

    private static final String LABEL_PREFIX = "Number of button clicks = ";
    private int numClicks = 0;
    Label message = null;

    @Override
    public void start(Stage stage) throws Exception {
        message = new Label(LABEL_PREFIX + numClicks);

        Button button = new Button("Click Me!");
        // add an instance of the inner class to handle button clicks
        button.setOnAction(new ButtonHandler());


        VBox pane = new VBox(5);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(message, button);

        Scene scene = new Scene(pane, 250, 100);
        stage.setScene(scene);
        stage.setTitle("Button Counter - Inner Class");
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

    // create an inner class
    class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            ++numClicks;
            message.setText(LABEL_PREFIX + numClicks);
        }
    }

}

