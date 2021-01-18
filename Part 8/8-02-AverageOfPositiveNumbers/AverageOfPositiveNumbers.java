
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                if(counter == 0) {
                    System.out.println("Cannot calculate the average");
                }
                double output = 1.0*total / counter;
                System.out.println(output);
                break;
            }
            if(input > 0) {
                counter++;
                total += input;
            }
        }
        scanner.close();
    }
}
