interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

abstract class Bird {
    String name;

    Bird(String name) {
        this.name = name;
    }

    abstract void display();
}

class Duck extends Bird implements Flyable, Swimmable {

    Duck(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " can fly");
    }

    public void swim() {
        System.out.println(name + " can swim");
    }

    void display() {
        System.out.println("Duck: " + name);
    }
}

class Penguin extends Bird implements Swimmable {

    Penguin(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(name + " can swim");
    }

    void display() {
        System.out.println("Penguin: " + name);
    }
}

public class BirdSanctuary {

    public static void main(String[] args) {

        Bird[] birds = {
                new Duck("Donald"),
                new Penguin("Pingu")
        };

        System.out.println("Flyable Birds:");

        for (Bird bird : birds) {
            if (bird instanceof Flyable) {
                bird.display();
            }
        }

        System.out.println("\nSwimmable Birds:");

        for (Bird bird : birds) {
            if (bird instanceof Swimmable) {
                bird.display();
            }
        }
    }
}