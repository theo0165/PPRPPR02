package ObserverPattern;

public abstract class Observer {
    protected User user;
    public abstract void update(String following);
}
