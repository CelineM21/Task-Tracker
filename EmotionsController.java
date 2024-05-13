package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class EmotionsController {
    @FXML
    private RadioButton happyButton;

    @FXML
    private RadioButton chockedButton;

    @FXML
    private RadioButton overwhelmedButton;

    @FXML
    private RadioButton sadButton;

    @FXML
    private RadioButton angryButton;

    @FXML
    private ToggleGroup emotionToggleGroup;

    @FXML
    public void initialize() {
        // Initialize the toggle group for radio buttons
        emotionToggleGroup = new ToggleGroup();
        happyButton.setToggleGroup(emotionToggleGroup);
        chockedButton.setToggleGroup(emotionToggleGroup);
        overwhelmedButton.setToggleGroup(emotionToggleGroup);
        sadButton.setToggleGroup(emotionToggleGroup);
        angryButton.setToggleGroup(emotionToggleGroup);

        // Set action listeners for the radio buttons
        happyButton.setOnAction(event -> showMessage("Spread love everywhere you go. Let no one ever come to you without leaving happier.- Mother Teresa"));
        chockedButton.setOnAction(event -> showMessage("Chocked: when the unexpected leaves you breathless!"));
        overwhelmedButton.setOnAction(event -> showMessage("Take life day by day, and be grateful for the little things. Don’t get stressed over what you can’t control."));
        sadButton.setOnAction(event -> showMessage("Sadness is a part of life, reminding us of our capacity to feel deeply!"));
        angryButton.setOnAction(event -> showMessage("Anger is like drinking poison and expecting the other person to die.”"));
    }


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
    private void homePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void gratitudePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Gratitude.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void journalPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Let's Journal.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void nightRoutinePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NightRoutine.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void emotionPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Emotions.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void nWorkPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("NWorkout.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Emotion");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
