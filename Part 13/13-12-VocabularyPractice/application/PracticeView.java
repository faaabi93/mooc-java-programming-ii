package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    private Dictionary dict;
    private String word;

    public PracticeView(Dictionary dict) {
        this.dict = dict;
        this.word = dict.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label instruction = new Label("Translate the word '" + this.word + "'");
        Label feedback = new Label("");
        TextField translationField = new TextField();
        Button checkButton = new Button("Check");

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(instruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedback, 0, 3);

        checkButton.setOnAction((event) -> {
            String translation = translationField.getText();
            if(dict.get(this.word).equals(translation)) {
                feedback.setText("Correct!");
            } else {
                feedback.setText("Incorrect! The translation for the word '" + word + "' is '" + dict.get(word) + "'");
                return;
            }

            this.word = this.dict.getRandomWord();
            instruction.setText("Translate the word '" + this.word + "'");
            translationField.clear();
        });

        return layout;
    }
}
