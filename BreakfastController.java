package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BreakfastController {
    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }
    @FXML
    public void gratitudeButtonOnAction(ActionEvent event) {gratitudePage(event);}
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
    public void homePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root,1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void breakfastPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Breakfast.fxml"));
            Scene scene = new Scene(root,1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
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
    public void morningRoutinePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("MorningRoutine.fxml"));
            Scene scene = new Scene(root,1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
    public void mWorkoutPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("MWorkout.fxml"));
            Scene scene = new Scene(root,1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new dashboard
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}

