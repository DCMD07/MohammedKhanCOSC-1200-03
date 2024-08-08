/*
 * Name: Mohammed Aasim
 * Program: User Information Form
 * Date: August 8, 2024
 * Description: A JavaFX app that lets users enter their info and shows it in a formatted way.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInformationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Set the title of the window
        primaryStage.setTitle("User Information Form");

        // Create text fields for first name, last name, and age
        TextField firstNameField = new TextField();
        firstNameField.setPromptText("Enter your first name");

        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Enter your last name");

        TextField ageField = new TextField();
        ageField.setPromptText("Enter your age");

        // Create a combo box for selecting the favorite color
        ComboBox<String> colorComboBox = new ComboBox<>();
        colorComboBox.getItems().addAll("Red", "Green", "Blue", "Yellow", "Black", "White");
        colorComboBox.setPromptText("Select your favorite color");

        // Create buttons for Submit and Clear actions
        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        // Create a label to display the result
        Label outputLabel = new Label();

        // When the submit button is clicked, display the entered information
        submitButton.setOnAction(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String age = ageField.getText();
            String color = colorComboBox.getValue();
            if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || color == null) {
                outputLabel.setText("Please fill out all fields.");
            } else {
                // Display the formatted message
                outputLabel.setText(firstName + " " + lastName + ", age " + age + ", loves the color " + color + ".");

                // Clear the fields after submission
                firstNameField.clear();
                lastNameField.clear();
                ageField.clear();
                colorComboBox.getSelectionModel().clearSelection();
            }
        });
