package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Controller class for the gratitude functionality.
 */
public class GratitudeController {

    /**
     * Handles the action when the home button is clicked.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    /**
     * Handles the action when the gratitude button is clicked.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {
        gratitudePage(event);
    }

    /**
     * Handles the action when the breakfast button is clicked.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void breakfastButtonOnAction(ActionEvent event) {
        breakfastPage(event);
    }

    /**
     * Handles the action when the morning routine button is clicked.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void mRButtonOnAction(ActionEvent event) {
        morningRoutinePage(event);
    }

    /**
     * Handles the action when the workout button is clicked.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void workoutButtonOnAction(ActionEvent event) {
        mWorkoutPage(event);
    }

    /**
     * Loads and displays the home page.
     *
     * @param event The action event triggered by the button click.
     */
    public void homePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and displays the breakfast page.
     *
     * @param event The action event triggered by the button click.
     */
    public void breakfastPage(ActionEvent event) {
        try {
            // Load the new breakfast view
            Parent root = FXMLLoader.load(getClass().getResource("Breakfast.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new breakfast page
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and displays the gratitude page.
     *
     * @param event The action event triggered by the button click.
     */
    public void gratitudePage(ActionEvent event) {
        try {
            // Load the new gratitude view
            Parent root = FXMLLoader.load(getClass().getResource("Gratitude.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new gratitude page
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and displays the morning routine page.
     *
     * @param event The action event triggered by the button click.
     */
    public void morningRoutinePage(ActionEvent event) {
        try {
            // Load the new morning routine view
            Parent root = FXMLLoader.load(getClass().getResource("MorningRoutine.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new morning routine page
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and displays the workout page.
     *
     * @param event The action event triggered by the button click.
     */
    public void mWorkoutPage(ActionEvent event) {
        try {
            // Load the new workout view
            Parent root = FXMLLoader.load(getClass().getResource("MWorkout.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new workout page
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}
