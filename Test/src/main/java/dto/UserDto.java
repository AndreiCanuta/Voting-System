package dto;

import model.Room;

import java.util.List;

public class UserDto {
    private String name;
    private int ID;
    private List<Room> roomList;

    public UserDto(String name, int ID, List<Room> roomList) {
        this.name = name;
        this.ID = ID;
        this.roomList = roomList;
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

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", roomList=" + roomList +
                '}';
    }
}
