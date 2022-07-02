package model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private String link;
    private List<User> userList;
    private int averageVote;
    private boolean voteStart;

    public Room (String name) {
        this.name = name;
        this.link = "";
        this.averageVote = 0;
        this.userList = new ArrayList<>();
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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getAverageVote() {
        return averageVote;
    }

    public void setAverageVote(int averageVote) {
        this.averageVote = averageVote;
    }

    public boolean isVoteStart() {
        return voteStart;
    }

    public void setVoteStart(boolean voteStart) {
        this.voteStart = voteStart;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", userList=" + userList +
                ", averageVote=" + averageVote +
                '}';
    }
}
