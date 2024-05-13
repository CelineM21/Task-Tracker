package org.example.proj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * The main class for the Task Application.
 */
public class TaskApplication extends Application {

    // Variables to store initial mouse click coordinates for window dragging
    double x, y = 0;

    /**
     * The main entry point for the application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * The start method initializes and displays the primary stage.
     *
     * @param primaryStage The primary stage for the application.
     * @throws Exception if an error occurs during stage initialization.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load the login page FXML file
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));

        // Set the stage style to undecorated (no window decorations)
        primaryStage.initStyle(StageStyle.UNDECORATED);

        // Set up event handlers for window dragging
        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            // Calculate new window position based on mouse movement
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);
        });

        // Create a scene with the loaded root node and set its dimensions
        primaryStage.setScene(new Scene(root, 1000, 700));

        // Show the primary stage
        primaryStage.show();
    }
}
