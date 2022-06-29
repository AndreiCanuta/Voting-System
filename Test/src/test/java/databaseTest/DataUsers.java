package databaseTest;

import java.util.HashMap;
import java.util.Map;

public class DataUsers {
    private static DataUsers instance = null;
    public Map<String, Object> data;

    private DataUsers() {
        data = new HashMap<String, Object>();
    }

    public static DataUsers getInstance() {
        if (instance == null) {
            instance = new DataUsers();
        }
        return instance;
    }

    public void add(String key, Object obj) {
        instance.data.put(key, obj);
    }

    public Object get(String key) {
        return instance.data.get(key);
    }

}
