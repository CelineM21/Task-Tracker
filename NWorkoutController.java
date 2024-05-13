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
 * Controller class for handling navigation between different pages in the application.
 */
public class NWorkoutController {

    /**
     * Switches to the home page.
     *
     * @param event The ActionEvent triggered when the home button is clicked.
     */
    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    /**
     * Switches to the night routine page.
     *
     * @param event The ActionEvent triggered when the night routine button is clicked.
     */
    @FXML
    public void nRButtonOnAction(ActionEvent event) {
        nightRoutinePage(event);
    }

    /**
     * Switches to the emotions page.
     *
     * @param event The ActionEvent triggered when the emotions button is clicked.
     */
    @FXML
    public void emotionsButtonOnAction(ActionEvent event) {
        emotionPage(event);
    }

    /**
     * Switches to the workout page.
     *
     * @param event The ActionEvent triggered when the workout button is clicked.
     */
    @FXML
    public void nWorkoutButtonOnAction(ActionEvent event) {
        nWorkPage(event);
    }

    /**
     * Switches to the journal page.
     *
     * @param event The ActionEvent triggered when the journal button is clicked.
     */
    @FXML
    public void journalButtonOnAction(ActionEvent event) {
        journalPage(event);
    }

    /**
     * Switches to the gratitude page.
     *
     * @param event The ActionEvent triggered when the gratitude button is clicked.
     */
    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {
        gratitudePage(event);
    }

    /**
     * Loads and switches to the home page.
     *
     * @param event The ActionEvent triggered.
     */
    public void homePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and switches to the journal page.
     *
     * @param event The ActionEvent triggered.
     */
    public void journalPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Let's Journal.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and switches to the gratitude page.
     *
     * @param event The ActionEvent triggered.
     */
    public void gratitudePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Gratitude.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and switches to the night routine page.
     *
     * @param event The ActionEvent triggered.
     */
    public void nightRoutinePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NightRoutine.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and switches to the emotions page.
     *
     * @param event The ActionEvent triggered.
     */
    public void emotionPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Emotions.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads and switches to the workout page.
     *
     * @param event The ActionEvent triggered.
     */
    public void nWorkPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NWorkout.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
