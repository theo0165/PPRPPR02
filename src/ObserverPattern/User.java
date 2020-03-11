package ObserverPattern;

import java.util.ArrayList;

public class User {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private boolean state;
    private String name;

    public User(String _name){
        this.name = _name;
    }

    public boolean getState(){
        return state;
    }

    public void setState(boolean state){
        this.state = state;
        notifyAllObservers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attatch(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update(name);
        }
    }
}
