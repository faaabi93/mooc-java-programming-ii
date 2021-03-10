package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {

    private Dictionary dict;

    public InputView(Dictionary dict) {
        this.dict = dict;
    }

    public Parent getView() {
        GridPane layout = new GridPane();
        
        // assets
        Label word = new Label("Word");
        Label translation = new Label("Translation");
        TextField wordTextField = new TextField();
        TextField translationTextField = new TextField();
        Button addButton = new Button("Add the word pair");

        // styling the grid
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // adding assets to the Grid
        layout.add(word, 0, 0);
        layout.add(wordTextField, 1, 0);
        layout.add(translation, 0, 1);
        layout.add(translationTextField, 1, 1);
        layout.add(addButton, 0, 2);

        // button functionality
        addButton.setOnAction((event) -> {
            String w = wordTextField.getText();
            String t = translationTextField.getText();

            dict.add(w, t);

            wordTextField.clear();
            translationTextField.clear();
        });

        // return
        return layout;
    }
    
}
