package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(640, 640);
        GraphicsContext painter = canvas.getGraphicsContext2D();

        drawSmiley(painter);
        
        BorderPane layout = new BorderPane();
        layout.setCenter(canvas);

        canvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();

            painter.setFill(Color.BLACK);
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene scene = new Scene(layout);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawSmiley(GraphicsContext painter) {
        painter.setFill(Color.BLACK);

        // left eye
        painter.fillRect(160, 80, 80, 80);
        // right eye
        painter.fillRect(400, 80, 80, 80);
        // left mouth
        painter.fillRect(80, 320, 80, 80);
        // right mouth
        painter.fillRect(480, 320, 80, 80);
        // mouth
        painter.fillRect(160, 400, 320, 80);
    }

}
