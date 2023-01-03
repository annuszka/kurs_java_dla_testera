import model.Bug;
import model.User;

public class MainApp {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Small issue", "reporter@bug.test", 1);
        bug1.showAllBugInfo();
        bug1.showBugStatus();
        bug1.showEmail();
        int bugPriority = bug1.getBugPriority();
        System.out.println(bugPriority);

        bug1.setBugDescription("test");
        bug1.showAllBugInfo();

        User user1 = new User("Laura", "Palmer", "laura@twinpeaks.com", 18 );
        User user2 = new User("Laura", "Palmer", "laura@twinpeaks.com", 18 );

        System.out.println(user1.isUserAdult());
        System.out.println(User.getUserCounter());
        System.out.println(user1);
        System.out.println(user1.equals(user2));
    }
}
