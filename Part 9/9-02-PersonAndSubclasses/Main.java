import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        Person fabian = new Person("Fabian Baiersdörfer", "Rentweinsdorf");
        Person peter = new Person("Peter R.", "Baunach");
        System.out.println(fabian);
        System.out.println(peter);

        Student fabi = new Student("Fabian", "immernoch Rentweinsdorf");
        System.out.println(fabi);
        System.out.println("Study credits: " + fabi.credits());
        fabi.study();
        System.out.println("Study credits: " + fabi.credits());

        Teacher lehrer = new Teacher("Name", "Adresse", 1234);
        System.out.println(lehrer);

        ArrayList<Person> persons = new ArrayList<Person>();
    }

    public static void printPersons(ArrayList<Person> persons){
        for(Person person: persons) {
            System.out.println(person);
        }
    }

}
