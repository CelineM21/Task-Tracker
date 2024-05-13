package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Controller class for the main workout page.
 */
public class MWorkoutController {

    /**
     * Action handler for the home button.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    /**
     * Action handler for the gratitude button.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {
        gratitudePage(event);
    }

    /**
     * Action handler for the breakfast button.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    public void breakfastButtonOnAction(ActionEvent event) {
        breakfastPage(event);
    }

    /**
     * Action handler for the morning routine button.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    public void mRButtonOnAction(ActionEvent event) {
        morningRoutinePage(event);
    }

    /**
     * Action handler for the workout button.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    public void workoutButtonOnAction(ActionEvent event) {
        mWorkoutPage(event);
    }

    /**
     * Loads the home page view.
     *
     * @param event The action event triggered by the button.
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
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the breakfast page view.
     *
     * @param event The action event triggered by the button.
     */
    public void breakfastPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Breakfast.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the gratitude page view.
     *
     * @param event The action event triggered by the button.
     */
    public void gratitudePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Gratitude.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the morning routine page view.
     *
     * @param event The action event triggered by the button.
     */
    public void morningRoutinePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("MorningRoutine.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the main workout page view.
     *
     * @param event The action event triggered by the button.
     */
    public void mWorkoutPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("MWorkout.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}

