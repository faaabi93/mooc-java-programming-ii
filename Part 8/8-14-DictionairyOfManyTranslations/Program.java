
public class Program {

    public static void main(String[] args) {
        // Test
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("Stuhl", "Stuhl");
        dictionary.add("Stuhl", "Zwei");

        dictionary.add("A", "AA");
        dictionary.add("A", "AAA");

        System.out.println(dictionary.translate("Stuhl"));
        dictionary.remove("Stuhl");
        System.out.println(dictionary.translate("Stuhl"));
        System.out.println(dictionary.translate("Hallo"));
    }
}
