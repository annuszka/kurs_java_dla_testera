import model.User;

public class MainApp {
    public static void main(String[] args) {

        User user1 = new User("Laura", "Palmer", "laura@twinpeaks.com", 18 );

        System.out.println(user1.isUserAdult());
        System.out.println(User.getUserCounter());
    }
}
