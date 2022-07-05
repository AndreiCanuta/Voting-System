package database;

import entity.Cookie;
import entity.Room;
import entity.User;
import entity.Vote;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database instance = null;
    public List<User> users;
    public List<Room> rooms;
    public List<Vote> votes;
    public List<Cookie> cookies;

    private Database () {
        users = new ArrayList<User>();
        rooms = new ArrayList<Room>();
        votes = new ArrayList<Vote>();
        cookies = new ArrayList<Cookie>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
