package org.example.proj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;

/**
 * Controller class for the important tasks page.
 */
public class ImportantController {

    @FXML
    private TextField importantField;

    @FXML
    private ListView<String> importantTasksListView;

    /**
     * Event handler for the add task button.
     *
     * @param event The mouse event triggered by the button click.
     */
    @FXML
    void addTask(MouseEvent event) {
        importantTasksListView.getItems().add(importantField.getText());
    }
    @FXML
    void removeTask(MouseEvent event) {
        int selectedID = importantTasksListView.getSelectionModel().getSelectedIndex();
        importantTasksListView.getItems().remove(selectedID);
    }

    /**
     * Event handler for the tasks button.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void tasksButtonOnAction(ActionEvent event) {
        tasksPage(event);
    }

    /**
     * Event handler for the important button.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void importantButtonOnAction(ActionEvent event) {
        importantPage(event);
    }

    /**
     * Event handler for the my day button.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void myDayButtonOnAction(ActionEvent event) {
        myDayPage(event);
    }

    /**
     * Event handler for the home button.
     *
     * @param event The action event triggered by the button click.
     */
    @FXML
    public void homeButtonOnAction(ActionEvent event) {
        homePage(event);
    }

    /**
     * Loads the tasks page.
     *
     * @param event The action event triggered by the button click.
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
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the my day page.
     *
     * @param event The action event triggered by the button click.
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
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the important page.
     *
     * @param event The action event triggered by the button click.
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
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Loads the home page.
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
     * Adds a task to the important tasks ListView.
     *
     * @param task The task to add to the ListView.
     */
    public void addTask(String task) {
        // Add the task to the ListView
        importantTasksListView.getItems().add(task);
    }
}
