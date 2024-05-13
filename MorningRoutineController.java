package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.example.proj.utils.SessionInfo;

/**
 * Controller class for the morning routine view.
 */
public class MorningRoutineController {
    @FXML
    private Label usernameLabel;

    /**
     * Initializes the controller.
     * Sets the username label to greet the user with "Good Morning" if a username is available.
     */
    @FXML
    public void initialize() {
        String username = SessionInfo.getInstance().getUsername();
        if (username != null && !username.isEmpty()) {
            usernameLabel.setText("Good Morning, " + username + "!");
        }
    }

    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {
        gratitudePage(event);
    }

    @FXML
    public void breakfastButtonOnAction(ActionEvent event) {
        breakfastPage(event);
    }

    @FXML
    public void mRButtonOnAction(ActionEvent event) {
        morningRoutinePage(event);
    }

    @FXML
    public void workoutButtonOnAction(ActionEvent event) {
        mWorkoutPage(event);
    }

    /**
     * Handles the event when the home button is clicked.
     * Redirects to the dashboard view.
     *
     * @param event The action event triggered by clicking the button.
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
     * Handles the event when the breakfast button is clicked.
     * Redirects to the breakfast view.
     *
     * @param event The action event triggered by clicking the button.
     */
    public void breakfastPage(ActionEvent event) {
        try {
            // Load the new breakfast view
            Parent root = FXMLLoader.load(getClass().getResource("Breakfast.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage breakfastStage = new Stage();
            breakfastStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new breakfast view
            breakfastStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Handles the event when the gratitude button is clicked.
     * Redirects to the gratitude view.
     *
     * @param event The action event triggered by clicking the button.
     */
    public void gratitudePage(ActionEvent event) {
        try {
            // Load the new gratitude view
            Parent root = FXMLLoader.load(getClass().getResource("Gratitude.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage gratitudeStage = new Stage();
            gratitudeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new gratitude view
            gratitudeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Handles the event when the morning routine button is clicked.
     * Redirects to the morning routine view.
     *
     * @param event The action event triggered by clicking the button.
     */
    public void morningRoutinePage(ActionEvent event) {
        try {
            // Load the new morning routine view
            Parent root = FXMLLoader.load(getClass().getResource("MorningRoutine.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage routineStage = new Stage();
            routineStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new morning routine view
            routineStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Handles the event when the workout button is clicked.
     * Redirects to the workout view.
     *
     * @param event The action event triggered by clicking the button.
     */
    public void mWorkoutPage(ActionEvent event) {
        try {
            // Load the new workout view
            Parent root = FXMLLoader.load(getClass().getResource("MWorkout.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage workoutStage = new Stage();
            workoutStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new workout view
            workoutStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
