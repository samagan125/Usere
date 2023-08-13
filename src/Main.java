import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "Barsbek", 16));
        users.add(new User(2, "Damir", 21));
        users.add(new User(3, "Azam", 30));
        users.add(new User(4, "Alex", 17));
        users.add(new User(5, "Aziz", 20));


        for (User user : users) {
            if (user.getAge() % 2 == 0) {
                System.out.println("User id: " + user.getId());
                System.out.println("User name: " + user.getName());
                System.out.println("User age: " + user.getAge());
                System.out.println();
            }
        }
    }
}
