package SOLID.Labb2;

public class Dog extends Animal {

    public Dog(String color, String name) {
        super(color, name);
    }

    void speak() {
        System.out.println("Dog is barking!");
    }

    void sleep() {
        System.out.println("Dog is sleeping!");
    }

    void eat() {
        System.out.println("Dog is eating.");
    }

    void walk() { System.out.println("Walking"); }
}
