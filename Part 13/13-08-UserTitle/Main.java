package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Title eingeben!");
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();

        Application.launch(UserTitle.class,
            "--title="+title);
        scan.close();
    }

}
