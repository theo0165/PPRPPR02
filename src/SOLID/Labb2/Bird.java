package SOLID.Labb2;

public class Bird extends Animal {

    public Bird(String color, String name) { super(color, name); }

    void speak() {
        System.out.println("Bird is chirping!");
    }

    void sleep() {
        System.out.println("Bird is sleeping!");
    }

    void eat() {
        System.out.println("Bird is peck-peck-pecking away!");
    }

    void walk() { System.out.println("Flying"); }
}
