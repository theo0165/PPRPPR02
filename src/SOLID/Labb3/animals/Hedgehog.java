package SOLID.Labb3.animals;

import SOLID.Labb3.interfaces.animals.IHedgehog;

public class Hedgehog extends Animal implements IHedgehog {

    public Hedgehog(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Hedgehog is squeeking!");
    }

    public void sleep() {
        System.out.println("Hedgehog is napping!");
    }

    public void eat() {
        System.out.println("Hedgehog is omnomnoming!");
    }

    @Override
    public void trot() {
        System.out.println("Hedgehog is trotting!");
    }

    @Override
    public void skip() {
        System.out.println("Hedgehog is skipping and hopping!");
    }

    @Override
    public void swim() {
        System.out.println("Hedgehog is stalking snaek!");
    }

    @Override
    public void roll() {
        System.out.println("Sonic is rolling so fast!");
    }

    @Override
    public void sit() {
        System.out.println("Hedgehog sitting for tea!");
    }

    @Override
    public void dash() {
        System.out.println("Sonic the speedster!");
    }
}
