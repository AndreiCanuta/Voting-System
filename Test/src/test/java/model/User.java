package model;

public class User {
    private String email;
    private String username;
    private boolean vote;

    public User(String email) {
        this.email = email;
        this.vote = false;
        String[] emailSplit = email.split("@");
        this.username = emailSplit[0];
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", vote=" + vote +
                '}';
    }
}
