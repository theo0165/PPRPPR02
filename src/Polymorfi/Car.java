package Polymorfi;

public abstract class Car {
    private String _engine;
    private String _brand;
    private String _model;

    public String getEngine() { return _engine; }

    public void setEngine(String engine) { _engine = engine; }

    public String getBrand() { return _brand; }

    public void setBrand(String color) { _brand = color; }

    public String getModel() { return _model; }

    public void setModel(String model) { _model = model; }

    public String getCarInfo(){ return "The car is a " + _brand + " " + _model + " with an " + _engine + " engine."; }

    public abstract String refuel();

    public abstract String honk();

    public abstract String start();
}
