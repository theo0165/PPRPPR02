package SOLID.Labb2;

public abstract class Animal {

    private String _color;
    private String _name;

    public Animal(String color, String name) {
        _color = color;
        _name = name;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    abstract void walk();

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getName() { return _name; }

    public void setName(String _name) { this._name = _name; }
}
