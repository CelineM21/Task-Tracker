package org.example.proj;

import org.example.proj.utils.SessionInfo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

/**
 * Controller class for the login functionality.
 */
public class LoginController {

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;

    /**
     * Handles the login button action.
     *
     * @param event The ActionEvent triggered by the login button.
     */
    public void loginButtonOnAction(ActionEvent event) {
        if (!usernameTextField.getText().isBlank() && !enterPasswordField.getText().isBlank()) {
            // Set the username in the session
            SessionInfo.getInstance().setUsername(usernameTextField.getText());
            // Navigate to the dashboard page
            dashBoardPage(event);
        } else {
            // Display an error message if username or password is empty
            loginMessageLabel.setText("Please enter username and password");
        }
    }

    /**
     * Handles the cancel button action.
     *
     * @param event The ActionEvent triggered by the cancel button.
     */
    public void cancelButtonOnAction(ActionEvent event){
        // Close the login window
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    /**
     * Navigates to the dashboard page.
     *
     * @param event The ActionEvent triggered to navigate to the dashboard page.
     */
    public void dashBoardPage(ActionEvent event) {
        try {
            // Load the dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root,1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current login window
            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the dashboard
            homeStage.show();
        } catch (Exception e) {
            // Handle any exceptions that occur during navigation
            e.printStackTrace();
            e.getCause();
        }
    }
}
