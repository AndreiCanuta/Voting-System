package model;

public class Vote {
    private String username;
    private boolean vote;

    public Vote(String username, boolean vote) {
        this.username = username;
        this.vote = vote;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isVote() {
        return vote;
    }

    public void setVote(boolean vote) {
        this.vote = vote;
    }
}
