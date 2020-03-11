package ObserverPattern;

public class Follower extends Observer {
    public Follower(User user){
        this.user = user;
        this.user.attatch(this);
    }

    @Override
    public void update(String following) {
        System.out.println(this.user.getName() + " is now " + (this.user.getState() ? "following" : "not following"));
    }
}
