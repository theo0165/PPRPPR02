package SOLID.Labb3.animals;

import SOLID.Labb3.interfaces.animals.IOwl;

public class Owl extends Bird implements IOwl {

    public Owl(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void fly() {
        System.out.println("Owl is gliding silently through the air!");
    }

    @Override
    public void skip() {
        System.out.println("Owl is skipping and hopping!");
    }

    @Override
    public void jump() {
        System.out.println("Owl is jumping!");
    }

    @Override
    public void sit() {
        System.out.println("Owl is squatting on dem eggs!");
    }
}
