
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                list.stream().forEach(line -> System.out.println(line));
                break;
            }
            list.add(input);
        }
        scanner.close();
    }
}
