
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        
        // Part 1:
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        
        Dog fido = new Dog("Fido");
        fido.bark();

        // Part 2:
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        // Part 3:
        NoiseCapable doggo = new Dog();
        doggo.makeNoise();

        NoiseCapable katz = new Cat("Garfield");
        katz.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

    }

}
