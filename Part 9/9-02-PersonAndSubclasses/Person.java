public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        // two spaces after \n to pass the test!
        return "" + this.name + "\n  " + this.address;
    }
}
