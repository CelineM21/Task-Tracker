package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

/**
 * Controller class for the MyDay page.
 */
public class MyDayController {

    @FXML
    private Label date; // This label will display the date

    /**
     * Initializes the controller.
     */
    public void initialize() {
        updateDate(); // Call this method to set the date when the view is initialized
    }

    /**
     * Updates the date label with the current date.
     */
    private void updateDate() {
        LocalDate today = LocalDate.now(); // Get today's date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy"); // Format date
        String formattedDate = today.format(formatter); // Get formatted date
        date.setText(formattedDate); // Set the text of the date label
    }

    @FXML
    public void tasksButtonOnAction(ActionEvent event) {
        tasksPage(event);
    }

    @FXML
    public void importantButtonOnAction(ActionEvent event) {
        importantPage(event);
    }

    @FXML
    private TextField taskField;

    @FXML
    private ListView<String> listOfTasks;

    @FXML
    void addTask(MouseEvent event) {
        listOfTasks.getItems().add(taskField.getText());
    }
    @FXML
    void removeTask(MouseEvent event) {
        int selectedID = listOfTasks.getSelectionModel().getSelectedIndex();
        listOfTasks.getItems().remove(selectedID);
    }

    @FXML
    public void myDayButtonOnAction(ActionEvent event) {
        myDayPage(event);
    }

    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    /**
     * Redirects to the Tasks page.
     *
     * @param event The ActionEvent triggered by clicking the button.
     */
    public void tasksPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Tasks.fxml"));
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
     * Redirects to the MyDay page.
     *
     * @param event The ActionEvent triggered by clicking the button.
     */
    public void myDayPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("MyDay.fxml"));
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
     * Redirects to the Important page.
     *
     * @param event The ActionEvent triggered by clicking the button.
     */
    public void importantPage(ActionEvent event) {
        try {
            // Load the new dashboard view
            Parent root = FXMLLoader.load(getClass().getResource("Importantt.fxml"));
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
     * Redirects to the Home page.
     *
     * @param event The ActionEvent triggered by clicking the button.
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
}
