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

public class DashboardController {
    @FXML
    private Label usernameLabel;

    @FXML
    public void initialize() {
        String username = SessionInfo.getInstance().getUsername();
        if (username != null && !username.isEmpty()) {
            usernameLabel.setText("Hello, " + username + "!");
        }
    }

    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    @FXML
    public void nightRoutineButtonOnAction(ActionEvent event) {
        nightRoutinePage(event);
    }

    @FXML
    public void morningRoutineButtonOnAction(ActionEvent event) {
        morningRoutinePage(event);
    }

    @FXML
    public void myDayButtonOnAction(ActionEvent event) {
        myDayPage(event);
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
    public void nightRoutinePage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("NightRoutine.fxml"));
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
    public void myDayPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("MyDay.fxml"));
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
