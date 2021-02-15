public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(this.name + " eats");
    };

    void sleep(){
        System.out.println(this.name + " sleeps");
    };

    String getName() {
        return this.name;
    }
}
