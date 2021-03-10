package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        
        // ----------------------- First Scene --------------------
        // Creating components
        Label instructions = new Label("Enter your name and start");
        TextField textField = new TextField();
        Button startButton = new Button("Start"); 

        // GridPane for layout
        GridPane gPane = new GridPane();
        gPane.add(instructions, 0, 0);
        gPane.add(textField, 0, 1);
        gPane.add(startButton, 0, 2);

        // Styling the GridPane
        gPane.setPrefSize(300, 100);
        gPane.setAlignment(Pos.CENTER);
        gPane.setVgap(10);
        gPane.setHgap(10);
        gPane.setPadding(new Insets(20, 20, 20, 20));
        

        // Creating the first scene
        Scene firstScene = new Scene(gPane);


        // ----------------------- Second Scene --------------------
        // Creating components
        Label welcomeText = new Label();

        // GridPane for layout
        GridPane gPaneTwo = new GridPane();

        // Styling
        gPaneTwo.getChildren().addAll(welcomeText);
        gPaneTwo.setPrefSize(300, 100);
        gPaneTwo.setAlignment(Pos.CENTER);
        gPaneTwo.setVgap(10);
        gPaneTwo.setHgap(10);
        gPaneTwo.setPadding(new Insets(20, 20, 20, 20));

        // Creating the second scene
        Scene secondScene = new Scene(gPaneTwo);


        // ----------------------- Event Listeners --------------------
        startButton.setOnAction((event) -> {
            welcomeText.setText("Welcome " + textField.getText() + "!");
            window.setScene(secondScene);
        });
        
        // Show firstScene on start-up
        window.setScene(firstScene);
        window.show();
    }
}
