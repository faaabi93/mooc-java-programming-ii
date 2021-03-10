package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private boolean xturn;
    private boolean end;
    private Label turn;
    private Button[] buttons;
    private int turns;

    public TicTacToeApplication() {
        this.xturn = true;
        this.end = false;
        this.turns = 0;
        this.buttons = new Button[9];
        this.turn = new Label("Turn: X");
        for(int i = 0; i < 9; i++) {
            buttons[i] = createButton();
        }
    }

    private Button createButton() {
        Button btn = new Button(" ");
        btn.setFont(Font.font("Monospaced", 40));

        btn.setOnAction((event) -> {
            if(end) return;
            if(!btn.getText().equals(" ")) return;

            if(xturn){
                btn.setText("X");
                turn.setText("Turn: O");
                xturn = false;
                turns++;
            }else{
                btn.setText("O");
                turn.setText("Turn: X");
                xturn = true;
                turns++;
            }

            if((turns == 9)||gameFinished()) {
                turn.setText("The end!");
                end = true;
            }

            /*if(gameFinished()) {
                end = true;
            }*/
        });

        return btn;
    }
    private boolean gameFinished() {
        // Horizontale
        if(!buttons[0].getText().equals(" ")){
            if(buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText())){
                String winner = buttons[0].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        if(!buttons[1].getText().equals(" ")){
            if(buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText())){
                String winner = buttons[1].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        if(!buttons[2].getText().equals(" ")){
            if(buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText())){
                String winner = buttons[2].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        // Vertikale
        if(!buttons[0].getText().equals(" ")){
            if(buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())){
                String winner = buttons[0].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        if(!buttons[3].getText().equals(" ")){
            if(buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText())){
                String winner = buttons[3].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        if(!buttons[6].getText().equals(" ")){
            if(buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText())){
                String winner = buttons[6].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        // Diagonale
        if(!buttons[0].getText().equals(" ")){
            if(buttons[0].getText().equals(buttons[4].getText()) && buttons[0].getText().equals(buttons[8].getText())){
                String winner = buttons[0].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }

        if(!buttons[2].getText().equals(" ")){
            if(buttons[2].getText().equals(buttons[4].getText()) && buttons[2].getText().equals(buttons[6].getText())){
                String winner = buttons[2].getText();
                turn.setText("Winner: " + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane layout = new BorderPane();
        turn.setFont(Font.font("Monospaced", 40));

        // The game:
        GridPane game = new GridPane();
        game.add(buttons[0], 0, 0);
        game.add(buttons[1], 0, 1);
        game.add(buttons[2], 0, 2);
        game.add(buttons[3], 1, 0);
        game.add(buttons[4], 1, 1);
        game.add(buttons[5], 1, 2);
        game.add(buttons[6], 2, 0);
        game.add(buttons[7], 2, 1);
        game.add(buttons[8], 2, 2);


        // set layout
        layout.setTop(turn);
        layout.setCenter(game);


        // scene
        Scene view = new Scene(layout);

        primaryStage.setScene(view);
        primaryStage.show();
    }

}
