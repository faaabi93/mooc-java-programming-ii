import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {

            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].split(" ")[1] + ", " + line[5]));

        } catch (IOException error) {

            System.out.println("Error: " + error.getMessage());
        }

    }
}