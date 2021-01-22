
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container("First");
        Container container2 = new Container("Second");

        while (true) {
            System.out.println(container1);
            System.out.println(container2);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int number = Integer.valueOf(parts[1]);
            if(parts[0].equals("add")) {
                container1.add(number);
            }
            if(parts[0].equals("move")) {
                int amount = container1.amount();
                if(number > container1.amount()) {
                    number = amount;
                }
                container1.remove(number);
                container2.add(number);
            }
            if(parts[0].equals("remove")) {
                container2.remove(number);
            }

        }

        scan.close();
    }

}
