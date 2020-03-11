package ObserverPattern;

public class main {
    public static void main(String[] args) {
        User user = new User("User 1");

        new Follower(user);
        new Follower(user);

        user.setState(false);
        user.setState(true);
    }
}
