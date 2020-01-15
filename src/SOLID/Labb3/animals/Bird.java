package SOLID.Labb3.animals;

public abstract class Bird extends Animal{

    public Bird(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Bird is chirping!");
    }

    public void sleep() {
        System.out.println("Bird is sleeping!");
    }

    public void eat() {
        System.out.println("Bird is peck-peck-pecking away!");
    }
}
