package SOLID.Labb3.animals;

import SOLID.Labb3.interfaces.animals.IDuck;

public class Duck extends Bird implements IDuck {

    public Duck(String color, String descpriton)  {
        super(color,descpriton);
    }

    @Override
    public void fly() {
        System.out.println("Duck is soaring majestically!");
    }

    @Override
    public void jump() {
        System.out.println("Duck is jumping!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is zooming like a speed boat!");
    }

    @Override
    public void run() {
        System.out.println("Duck is running for takeoff!");
    }

    @Override
    public void roll() {
        System.out.println("Duck is good boi!");
    }

    @Override
    public void sit() {
        System.out.println("Duck is squatting on dem eggs!");
    }
}
