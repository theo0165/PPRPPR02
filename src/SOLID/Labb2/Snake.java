package SOLID.Labb2;

public class Snake extends Animal {

    public Snake(String color, String name) {
        super(color, name);
    }

    void speak() {
        System.out.println("Snaek is barking!");
    }

    void sleep() {
        System.out.println("Snaek is sleeping!");
    }

    void eat() {
        System.out.println("Snaek is eating.");
    }

    void walk() {
        System.out.println("Slithering!");
    }
}
