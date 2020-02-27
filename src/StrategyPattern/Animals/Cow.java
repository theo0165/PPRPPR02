package StrategyPattern.Animals;

public class Cow implements IAnimal {
    @Override
    public String makeSound() {
        return "Moooo";
    }

    @Override
    public String getName() {
        return "Ko";
    }
}
