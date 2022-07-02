package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int globalID = 0;
    private int ID;
    private String name;
    private String type;
    private int vote;
    private List<Room> roomList;

    public User () {
    }

    public User (String name) {
        globalID++;
        this.ID = globalID;
        this.name = name;
        this.type = "Player";
        this.vote = 0;
        this.roomList = new ArrayList<>();
    }

    public User (String name, int id, String type) {
        this.name = name;
        this.type = type;
        this.ID = id;
        this.vote = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", vote=" + vote +
                '}';
    }
}
