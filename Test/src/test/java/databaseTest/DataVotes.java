package databaseTest;

import java.util.HashMap;
import java.util.Map;

public class DataVotes {
    private static DataVotes instance = null;
    public Map<String, Object> data;

    private DataVotes() {
        data = new HashMap<String, Object>();
    }

    public static DataVotes getInstance() {
        if (instance == null) {
            instance = new DataVotes();
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
