
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        // Test Part 2:
        Person fabian = new Person("Fabian", Education.MA);
        System.out.println(fabian);

        Person fabio = new Person("Fabio", Education.HS);
        Person peter = new Person("Peter", Education.HS);
        Person dennis = new Person("Dennis", Education.MA);
        Person markus = new Person("Markus", Education.MA);
        Person kevin = new Person("Kevin", Education.BA);

        Employees employees = new Employees();
        employees.add(fabio);
        employees.add(kevin);
        employees.add(peter);
        employees.add(dennis);
        employees.add(markus);
        employees.add(fabian);

        employees.print(Education.MA);

    }
}
