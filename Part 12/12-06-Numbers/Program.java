import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Random random = new Random(); // random object
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int limit = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i < limit; i++) {
            System.out.println(random.nextInt(10));
        }

        scanner.close();
    }
}
