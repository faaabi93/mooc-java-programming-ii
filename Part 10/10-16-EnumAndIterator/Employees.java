import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    List<Person> list = new ArrayList<>();

    public Employees() {};

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while(iterator.hasNext()) {
            list.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> iterator = list.iterator();

        iterator.forEachRemaining(person -> System.out.println(person));
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();

        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();

            if(nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }

}