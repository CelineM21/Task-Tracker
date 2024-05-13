package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller class for handling journal-related actions.
 */
public class JournalController {

    /**
     * Switches to the home page view.
     *
     * @param event The ActionEvent triggered by clicking the home button.
     */
    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    /**
     * Switches to the night routine page view.
     *
     * @param event The ActionEvent triggered by clicking the night routine button.
     */
    @FXML
    public void nRButtonOnAction(ActionEvent event) {
        nightRoutinePage(event);
    }

    /**
     * Switches to the emotions page view.
     *
     * @param event The ActionEvent triggered by clicking the emotions button.
     */
    @FXML
    public void emotionsButtonOnAction(ActionEvent event) {
        emotionPage(event);
    }

    /**
     * Switches to the workout page view.
     *
     * @param event The ActionEvent triggered by clicking the workout button.
     */
    @FXML
    public void nWorkoutButtonOnAction(ActionEvent event) {
        nWorkPage(event);
    }

    /**
     * Switches to the journal page view.
     *
     * @param event The ActionEvent triggered by clicking the journal button.
     */
    @FXML
    public void journalButtonOnAction(ActionEvent event) {
        journalPage(event);
    }

    /**
     * Switches to the gratitude page view.
     *
     * @param event The ActionEvent triggered by clicking the gratitude button.
     */
    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {
        gratitudePage(event);
    }

    /**
     * Switches to the home page view.
     *
     * @param event The ActionEvent triggered by clicking a button.
     */
    public void homePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the journal page view.
     *
     * @param event The ActionEvent triggered by clicking a button.
     */
    public void journalPage(ActionEvent event) {
        try {
            // Load the new journal view
            Parent root = FXMLLoader.load(getClass().getResource("Let's Journal.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new journal view
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the gratitude page view.
     *
     * @param event The ActionEvent triggered by clicking a button.
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

            // Show the new gratitude view
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the night routine page view.
     *
     * @param event The ActionEvent triggered by clicking a button.
     */
    public void nightRoutinePage(ActionEvent event) {
        try {
            // Load the new night routine view
            Parent root = FXMLLoader.load(getClass().getResource("NightRoutine.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new night routine view
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the emotions page view.
     *
     * @param event The ActionEvent triggered by clicking a button.
     */
    public void emotionPage(ActionEvent event) {
        try {
            // Load the new emotions view
            Parent root = FXMLLoader.load(getClass().getResource("Emotions.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new emotions view
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the workout page view.
     *
     * @param event The ActionEvent triggered by clicking a button.
     */
    public void nWorkPage(ActionEvent event) {
        try {
            // Load the new workout view
            Parent root = FXMLLoader.load(getClass().getResource("NWorkout.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new workout view
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
