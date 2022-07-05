package entity;

public class Vote {
    private int userId;
    private int roomId;
    private int vote;

    public Vote(int userId, int roomId, int vote) {
        this.userId = userId;
        this.roomId = roomId;
        this.vote = vote;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}
