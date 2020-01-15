package SOLID.Labb3.sample;


import SOLID.Labb3.animals.*;
import SOLID.Labb3.interfaces.motions.*;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black", "Its a dog!"),
                            new Hedgehog("Blue", "Sonic!!"),
                            new Duck("Yellow", "Its a Duck!"),
                            new Owl("Brown", "Papa near!!"),
                            new Snake("Black and Yellow", "Holy heck its Snek!")};

        System.out.println("###############");
        System.out.println();

        activateAnimal(animals);
    }

    private static void activateAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.setColor("Grey");
            animal.printDescritption();
            System.out.println();

            move(animal);

            System.out.println("###############");
            System.out.println();
        }
    }

    private static void move(Animal animal) {
        if(animal instanceof IDash){
            ((IDash) animal).dash();
        }

        if(animal instanceof IFly){
            ((IFly) animal).fly();
        }

        if(animal instanceof IJump){
            ((IJump) animal).jump();
        }

        if(animal instanceof IRoll){
            ((IRoll) animal).roll();
        }

        if(animal instanceof IRun){
            ((IRun) animal).run();
        }

        if(animal instanceof ISit){
            ((ISit) animal).sit();
        }

        if(animal instanceof ISkip){
            ((ISkip) animal).skip();
        }

        if(animal instanceof ISlither){
            ((ISlither) animal).slither();
        }

        if(animal instanceof ISwim){
            ((ISwim) animal).swim();
        }

        if(animal instanceof ITrot){
            ((ITrot) animal).trot();
        }
    }
}
