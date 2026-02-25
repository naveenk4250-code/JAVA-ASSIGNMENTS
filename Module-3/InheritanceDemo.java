class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    public void fetch() {
        System.out.println(name + " is fetching the ball");
    }
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.displayInfo();
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.fetch();
    }
}
