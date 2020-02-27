package StrategyPattern.Animals;

public class Dog implements IAnimal {
    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String getName() {
        return "Hund";
    }
}
