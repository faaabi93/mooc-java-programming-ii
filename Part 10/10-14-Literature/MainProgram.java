
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                System.out.println("");
                System.out.println(books.size() + " books in total.");
                System.out.println("");
                //Part 1:
                /*for(Book book: books) {
                    System.out.println(book);
                }*/

                //Part 2 & 3:
                Comparator<Book> comparator = Comparator
                    .comparing(Book::getAgeRecommendation)
                    //Part 3:
                    .thenComparing(Book::getName);
                Collections.sort(books, comparator);

                for(Book book: books) {
                    System.out.println(book);
                }

                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, ageRecommendation));
        }
        scanner.close();
    }

}
