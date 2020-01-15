package Polymorfi;

public class Volvo extends Car {
    Volvo(){
        setBrand("Volvo");
        setEngine("Hybrid T8");
        setModel("XC90");
    }

    @Override
    public String refuel() {
        return "The has been charged to 100%";
    }

    @Override
    public String honk() {
        return "Meep Meep";
    }

    @Override
    public String start() {
        return "The silent hybrid engine is starting.";
    }
}
