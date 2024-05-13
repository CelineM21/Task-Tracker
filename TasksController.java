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
import java.io.IOException;

/**
 * Controller class for the Tasks view.
 */
public class TasksController {

    @FXML
    public void tasksButtonOnAction(ActionEvent event) {
        tasksPage(event);
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
    public void importantButtonOnAction(ActionEvent event) {
        importantPage(event);
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
     * Switches to the tasks page.
     *
     * @param event The ActionEvent that triggered this method.
     */
    public void tasksPage(ActionEvent event) {
        try {
            // Load the new tasks view
            Parent root = FXMLLoader.load(getClass().getResource("Tasks.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new stage
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the My Day page.
     *
     * @param event The ActionEvent that triggered this method.
     */
    public void myDayPage(ActionEvent event) {
        try {
            // Load the new My Day view
            Parent root = FXMLLoader.load(getClass().getResource("MyDay.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new stage
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the Important page.
     *
     * @param event The ActionEvent that triggered this method.
     */
    public void importantPage(ActionEvent event) {
        try {
            // Load the new Important view
            Parent root = FXMLLoader.load(getClass().getResource("Importantt.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new stage
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the Home page.
     *
     * @param event The ActionEvent that triggered this method.
     */
    public void homePage(ActionEvent event) {
        try {
            // Load the new Home view
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new stage
            homeStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches to the Important page with the selected task.
     *
     * @param event The MouseEvent that triggered this method.
     */
    public void goToImp(MouseEvent event) {
        try {
            // Load the new Important view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Importantt.fxml"));
            Parent root = loader.load();
            ImportantController importantController = loader.getController();
            importantController.addTask(listOfTasks.getSelectionModel().getSelectedItem());

            // Set up the scene and stage
            Scene scene = new Scene(root, 1000, 700);
            Stage homeStage = new Stage();
            homeStage.setScene(scene);

            // Close the current window
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Show the new stage
            homeStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
