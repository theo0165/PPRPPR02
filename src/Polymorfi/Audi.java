package Polymorfi;

public class Audi extends Car {
    Audi(){
        setBrand("Audi");
        setModel("A4");
        setEngine("V6");
    }

    @Override
    public String refuel() {
        return "Car is refueled with 61 liters petrol";
    }

    @Override
    public String honk() {
        return "HONK! HONK!";
    }

    @Override
    public String start() {
        return "The V6 engine is starting!";
    }
}
