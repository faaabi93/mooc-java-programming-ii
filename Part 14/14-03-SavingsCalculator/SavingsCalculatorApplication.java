package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Graph
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> linechart = new LineChart(xAxis, yAxis);
        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series interestSeries = new XYChart.Series();
        linechart.getData().add(savingsSeries);
        linechart.getData().add(interestSeries);
        linechart.setAnimated(false);
        linechart.setLegendVisible(false);
        linechart.setTitle("Savings calculator");

        // VBox - Menu
        VBox vbox = new VBox();

        BorderPane top = new BorderPane();
        top.setLeft(new Label("Monthly savings"));

        Slider topSlider = new Slider();
        topSlider.setMin(25);
        topSlider.setMax(250);
        topSlider.setSnapToTicks(true);
        topSlider.setBlockIncrement(500);
        topSlider.setShowTickLabels(true);
        topSlider.setShowTickMarks(true);
        topSlider.setValue(25);
        top.setCenter(topSlider);
        Label topSliderLabel = new Label("25");
        top.setRight(topSliderLabel);

        BorderPane bottom = new BorderPane();
        bottom.setLeft(new Label("Yearly interest rate"));
        Slider bottomSlider = new Slider();
        bottomSlider.setMin(0);
        bottomSlider.setMax(10);
        bottomSlider.setMinorTickCount(10);
        bottomSlider.setShowTickLabels(true);
        bottomSlider.setShowTickMarks(true);
        bottomSlider.setValue(0);
        bottom.setCenter(bottomSlider);
        Label bottomSliderLabel = new Label("0");
        bottom.setRight(bottomSliderLabel);

        vbox.getChildren().addAll(top, bottom);


        // Userinterface
        BorderPane layout = new BorderPane();
        layout.setTop(vbox);
        layout.setCenter(linechart);
        layout.setPadding(new Insets(10, 10, 10, 10));


        // Event-Listeners for sliders
        topSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            topSliderLabel.setText(String.valueOf(newvalue));
            updateSavings(topSlider.getValue(), bottomSlider.getValue(), savingsSeries, interestSeries);
        });

        bottomSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            String interestValue = String.valueOf(newvalue);
            if(interestValue.length() > 4) {
                interestValue = interestValue.substring(0, 4);
            }
            bottomSliderLabel.setText(interestValue);
            updateSavings(topSlider.getValue(), bottomSlider.getValue(), savingsSeries, interestSeries);
        });

        //
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

    private void updateSavings(double savings, double interest, XYChart.Series savingsSeries, XYChart.Series interestSeries) {
        savingsSeries.getData().clear();
        interestSeries.getData().clear();

        double totalSavings = 0;
        double totalSavingsWithInterest = 0;
        for(int i = 0; i < 31; i++) {
            savingsSeries.getData().add(new XYChart.Data(i, totalSavings));
            interestSeries.getData().add(new XYChart.Data(i, totalSavingsWithInterest));
            totalSavings += (12 * savings);
            totalSavingsWithInterest = (totalSavingsWithInterest + (12*savings)) * (1.0 + interest / 100);
        }
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
