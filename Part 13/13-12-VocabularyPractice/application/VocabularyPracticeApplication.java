package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// END SOLUTION
public class VocabularyPracticeApplication extends Application {

    private Dictionary dict;

    @Override
    public void init() throws Exception {
        // creating the dict which the program (other classes) uses.
        this.dict = new Dictionary();
    }

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        // Creating the views
        PracticeView practiceView = new PracticeView(dict);
        InputView inputView = new InputView(dict);

        // Creating the layout
        BorderPane layout = new BorderPane();

        // Menu for the layout
        HBox menu = new HBox();
        menu.setSpacing(10);
        menu.setPadding(new Insets(20, 20, 20, 20));
        Button btnOne = new Button("Enter new words!");
        Button btnTwo = new Button("Practice!");
        menu.getChildren().addAll(btnOne, btnTwo);

        layout.setTop(menu);

        // Subviews
        btnOne.setOnAction((event) -> layout.setCenter(inputView.getView()));
        btnTwo.setOnAction((event) -> layout.setCenter(practiceView.getView()));

        layout.setCenter(inputView.getView());
        Scene view = new Scene(layout, 400, 400);
        window.setScene(view);
        window.show();
        
    }
}
