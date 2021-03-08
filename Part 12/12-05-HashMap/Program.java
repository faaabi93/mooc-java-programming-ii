
public class Program {

    public static void main(String[] args) {
        // Test for adding:
        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add("World");

        // Testing grow():
        List<Integer> intList = new List<>();
        for(int i = 0; i < 20; i++) {
            intList.add(i);
        }

        // Testing contains():
        List<String> thirdList = new List<>();
        System.out.println(thirdList.contains("Fabian"));
        thirdList.add("Fabian");
        System.out.println(thirdList.contains("Fabian"));

        System.out.println("################");

        // Testing remove():
        List<String> fourthList = new List<>();
        System.out.println(fourthList.contains("Fabian"));
        fourthList.add("Fabian");
        System.out.println(fourthList.contains("Fabian"));
        fourthList.remove("Fabian");
        System.out.println(fourthList.contains("Fabian"));

        System.out.println("################");

        // Searching for an index:
        List<String> fifthList = new List<>();
        System.out.println(fifthList.contains("Fabian"));
        fifthList.add("Fabian");
        System.out.println(fifthList.contains("Fabian"));
        int index = fifthList.indexOfValue("Fabian");
        System.out.println(index);
        System.out.println(fifthList.value(index));
        fifthList.remove("Fabian");
        System.out.println(fifthList.contains("Fabian"));

        System.out.println("################");

        // Testing size();

        List<String> sixthList = new List<>();
        sixthList.add("Fabian");
        sixthList.add("Dennis");
        sixthList.add("Markus");
        System.out.println(sixthList.size());

        for(int i = 0; i < sixthList.size(); i++) {
            System.out.println(sixthList.value(i));
        }
    }

}
