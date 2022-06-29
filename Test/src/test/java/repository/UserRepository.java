package repository;

import databaseTest.DataUsers;
import model.User;

public class UserRepository {

    private final DataUsers dataUsers = DataUsers.getInstance();

    public boolean checkUser (String username) {
        return dataUsers.data.containsKey(username);
    }

    public void addUser(String email) {
        User user = new User (email);
        dataUsers.data.put(user.getUsername(), user);
    }
}
