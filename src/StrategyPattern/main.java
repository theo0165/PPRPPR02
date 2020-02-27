package StrategyPattern;

import StrategyPattern.Animals.Cow;
import StrategyPattern.Animals.Dog;
import StrategyPattern.Animals.Seagull;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static int animal;
    private static Context context;


    public static void main(String[] args) {
        System.out.println("==========================");
        System.out.println("     HUR LÅTER DJURET?    ");
        System.out.println("==========================");

        System.out.println("");
        System.out.println("Välj ett djur:");
        System.out.println("1. Hund");
        System.out.println("2. Ko");
        System.out.println("3. Fiskmås");
        System.out.println("");

        animal = scanner.nextInt();

        if(animal == 1){
            context = new Context(new Dog());
        }else if(animal == 2){
            context = new Context(new Cow());
        }else if(animal == 3){
            context = new Context(new Seagull());
        }else{
            System.out.println("Sluta försöka skapa buggar :(");
            System.exit(1);
        }

        System.out.println(context.getName() + " låter: " + context.execute());
    }
}
