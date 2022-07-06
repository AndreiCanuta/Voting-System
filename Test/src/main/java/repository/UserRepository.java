package repository;

import database.Database;
import entity.Cookie;
import entity.User;

public class UserRepository {
    private final Database database = Database.getInstance();

    public boolean checkUserByName (String name) {
        for (User u : database.users) {
            if (u.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void registerUser (String name, String password) {
        String hashedPassword = String.valueOf(password.hashCode());
        User user = new User (name, hashedPassword);
        database.users.add(user);
    }

    public boolean checkCredentials(String name, String password) {
        String hashedPassword = String.valueOf(password.hashCode());
        for (User u : database.users) {
            if (u.getName().equals(name) && u.getPassword().equals(hashedPassword)) {
                return true;
            }
        }
        return false;
    }

    public int getUserId (String name) {
        for (User u : database.users) {
            if (u.getName().equals(name)) {
                return u.getId();
            }
        }
        return 0;
    }

}
