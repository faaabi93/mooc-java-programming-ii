
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            int value = Integer.valueOf(scanner.nextLine());
            if(value < 0) {
                list.stream().filter(number -> number < 6 && 0 < number).forEach(s -> System.out.println(s));
                break;
            }
            list.add(value);
        }
        scanner.close();
    }
}
