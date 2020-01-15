package Polymorfi;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi();
        System.out.println(audi.getCarInfo());
        System.out.println(audi.refuel());
        System.out.println(audi.start());
        System.out.println(audi.honk());

        Volvo volvo = new Volvo();
        System.out.println(volvo.getCarInfo());
        System.out.println(volvo.refuel());
        System.out.println(volvo.start());
        System.out.println(volvo.honk());
    }
}
