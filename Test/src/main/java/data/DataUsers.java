package data;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class DataUsers {
    private static DataUsers instance = null;
    public Map<Integer, User> data;

    private DataUsers () {
        data = new HashMap<Integer, User>();
    }

    public static DataUsers getInstance() {
        if(instance == null) {
            instance = new DataUsers();
        }
        return instance;
    }
}
