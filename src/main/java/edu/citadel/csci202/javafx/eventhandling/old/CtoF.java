package edu.citadel.csci202.javafx.eventhandling.old;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CtoF extends Application {

    @Override
    public void start(Stage applicationStage) {

        Scene scene = null; // Scene contains all content
        GridPane gridPane = null; // Positions components within scene

        gridPane = new GridPane(); // Create an empty pane

        Label celLabel = new Label("Temp in Celsius:");
        // celLabel.setPrefWidth(20);

        Label fLabel = new Label("Temp in Fahrenheit:");
        // fLabel.setPrefWidth(20);

        TextField cField = new TextField();
        cField.setPrefColumnCount(5);
        cField.setEditable(true);
        cField.setText("0");

        TextField fField = new TextField();
        fField.setPrefColumnCount(5);
        fField.setEditable(false);

        // Create a "Calculate" button
        Button convButton = new Button("Convert C to F");

        gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around grid
        gridPane.setHgap(10); // Spacing between columns
        gridPane.setVgap(10); // Spacing between rows

        gridPane.add(celLabel, 0, 0);
        gridPane.add(cField, 1, 0);
        gridPane.add(fLabel, 0, 1);
        gridPane.add(fField, 1, 1);
        gridPane.add(convButton, 0, 2);

        convButton.setOnAction(e -> fField.setText((Double.parseDouble(cField.getText()) * 1.8 + 32) + ""));

        scene = new Scene(gridPane); // Create a scene containing the pane

        applicationStage.setScene(scene); // Set window's scene
        applicationStage.setTitle("Convert Celcius to Farenhiet"); // Set window's title
        applicationStage.show(); // Display window
    }

    public static void main(String[] args) {
        launch(args); // Launch application
    }

}