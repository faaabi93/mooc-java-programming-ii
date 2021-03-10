package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        // First scene --------------------------------------------------------------
        BorderPane borderPane = new BorderPane();
        Button firstButton = new Button("To the second view");
        borderPane.setTop(new Label("First view!"));
        borderPane.setCenter(firstButton);
        Scene firstScene = new Scene(borderPane, 300, 300);

        // Second scene -------------------------------------------------------------
        VBox vbox = new VBox();
        Button secondButton = new Button("To the third view!");
        vbox.getChildren().setAll(secondButton, new Label("Second view!"));
        Scene secondScene = new Scene(vbox, 300, 300);

        // Third scene --------------------------------------------------------------
        GridPane gridPane = new GridPane();
        Label thirdPaneText = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        gridPane.add(thirdPaneText, 0, 0);
        gridPane.add(thirdButton, 1, 1);
        Scene thirdScene = new Scene(gridPane, 300,300);

        // Event listeners ----------------------------------------------------------
        firstButton.setOnAction((event) -> {
            window.setScene(secondScene);
        });

        secondButton.setOnAction((event) -> {
            window.setScene(thirdScene);
        });

        thirdButton.setOnAction((event) -> {
            window.setScene(firstScene);
        });


        window.setScene(firstScene);
        window.show();
        
    }

}
