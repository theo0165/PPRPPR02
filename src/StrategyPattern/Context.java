package StrategyPattern;

import StrategyPattern.Animals.IAnimal;

public class Context {
    private IAnimal animal;

    public Context(IAnimal _animal){
        this.animal = _animal;
    }

    public String execute(){
        return animal.makeSound();
    }

    public String getName(){
        return animal.getName();
    }
}
