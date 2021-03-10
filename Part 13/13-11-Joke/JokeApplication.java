package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch (JokeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {

        // Main layout
        BorderPane layout = new BorderPane();

        // Menu 
        HBox menu = new HBox();
        menu.setSpacing(10);
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");
        menu.getChildren().addAll(jokeButton, answerButton, explanationButton);
        layout.setTop(menu);

        // Subviews
        StackPane jokeLayout = createView("What do you call a bear with no teeth?");
        StackPane answerLayout = createView("A gummy bear.");
        StackPane explanationLayout = createView("Because its not funny. Is this even a joke?");

        // Event Listeners
        jokeButton.setOnAction((event) -> layout.setCenter(jokeLayout));
        answerButton.setOnAction((event) -> layout.setCenter(answerLayout));
        explanationButton.setOnAction((event) -> layout.setCenter(explanationLayout));
        
        layout.setCenter(jokeLayout);

        // 
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        return layout;
    }
}
