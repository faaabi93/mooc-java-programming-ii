package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    private HashMap<String, HashMap<Integer, Double>> data;

    public PartiesApplication() {
        this.data = getData("partiesdata.tsv");
    }

    private HashMap<String, HashMap<Integer, Double>> getData(String filename) {
        HashMap<String, HashMap<Integer, Double>> data = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();

        // Reading the file
        try(Scanner scan = new Scanner(Paths.get(filename))) {
            
            // getting the years, which are in line 1:
            String row = scan.nextLine();
            String[] rowArray = row.split("\t");
            
            for(int i = 1; i < rowArray.length; i++) {     // starts at 1, because the index 0 is the String "Parties"
                years.add(Integer.valueOf(rowArray[i])); 
            }
            System.out.println(years);

            while(scan.hasNextLine()) {
                HashMap<Integer, Double> rowMap = new HashMap<>();
                String nextRow = scan.nextLine();
                String[] nextRowArray = nextRow.split("\t");
                String party = nextRowArray[0];
                for(int i = 1; i < nextRowArray.length; i++) { // starts at 1, because index 0 is the Party.
                    if(!nextRowArray[i].equals("-")){
                        rowMap.put(years.get(i-1), Double.valueOf(nextRowArray[i]));
                    }
                }
                data.put(party, rowMap);
            }
            

        } catch(IOException e) {
            System.err.println("Error: " + e.toString());
        }
        System.out.println(data);
        return data;
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) {
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        
        yAxis.setLabel("Support in %");
        xAxis.setLabel("Year");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        this.data.keySet().stream().forEach(party -> {
            XYChart.Series daten = new XYChart.Series();
            daten.setName(party);

            data.get(party).entrySet().stream().forEach(pair -> {
                daten.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            lineChart.getData().add(daten);
        });

        Scene scene = new Scene(lineChart, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

}
