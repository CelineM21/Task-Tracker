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

import java.io.IOException;

/**
 * Controller class for the Night Routine functionality.
 */
public class NightRoutineController {

    @FXML
    private Label usernameLabel;

    /**
     * Initializes the controller.
     * Retrieves the username from the session info and displays a welcome message.
     */
    @FXML
    public void initialize() {
        String username = SessionInfo.getInstance().getUsername();
        if (username != null && !username.isEmpty()) {
            usernameLabel.setText("Welcome back, " + username + "!");
        }
    }

    // Button actions

    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    @FXML
    public void nRButtonOnAction(ActionEvent event) {
        nightRoutinePage(event);
    }

    @FXML
    public void emotionsButtonOnAction(ActionEvent event) {
        emotionPage(event);
    }

    @FXML
    public void nWorkoutButtonOnAction(ActionEvent event) {
        nWorkPage(event);
    }

    @FXML
    public void journalButtonOnAction(ActionEvent event) {
        journalPage(event);
    }

    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {
        gratitudePage(event);
    }

    /**
     * Redirects to the home page.
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
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Redirects to the journal page.
     *
     * @param event The action event triggered by the button click.
     */


public void journalPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Let's Journal.fxml"));
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
     * Redirects to the gratitude page.
     *
     * @param event The action event triggered by the button click.
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
     * Redirects to the night routine page.
     *
     * @param event The action event triggered by the button click.
     */
    public void nightRoutinePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("NightRoutine.fxml"));
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
     * Redirects to the emotion page.
     *
     * @param event The action event triggered by the button click.
     */

    public void emotionPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Emotions.fxml"));
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
     * Redirects to the nWork page.
     *
     * @param event The action event triggered by the button click.
     */
    public void nWorkPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("NWorkout.fxml"));
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
