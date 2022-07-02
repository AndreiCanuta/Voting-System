package dto;

import model.User;

import java.util.List;

public class RoomDto {
    private String name;
    private String link;
    private int averageVote;
    private List<User> userList;

    public RoomDto(String name, String link, int averageVote, List<User> userList) {
        this.name = name;
        this.link = link;
        this.averageVote = averageVote;
        this.userList = userList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getAverageVote() {
        return averageVote;
    }

    public void setAverageVote(int averageVote) {
        this.averageVote = averageVote;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
