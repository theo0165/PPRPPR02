package StrategyPattern.Animals;

public class Seagull implements IAnimal {
    @Override
    public String makeSound() {
        return "Åt helvete";
    }

    @Override
    public String getName() {
        return "Fiskmås";
    }
}
