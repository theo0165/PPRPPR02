package SOLID.Labb2;

public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black", "Dog"),
                            new Hedgehog("Pink", "Hedgehog"),
                            new Bird("Yellow", "Bird"),
                            new Snake("Black and Yellow", "Snake")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            activateAnimal(animal);
        }
    }

    private static void activateAnimal(Animal animal) {
        System.out.println();

        animal.eat();
        animal.sleep();
        animal.speak();
        animal.walk();
        System.out.println(animal.getName());

        System.out.println("###############");
        System.out.println();
    }
}
