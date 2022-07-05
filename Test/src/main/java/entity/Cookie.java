package entity;

public class Cookie {
    private int userId;
    private String jwtToken;

    public Cookie(int userId, String jwtToken) {
        this.userId = userId;
        this.jwtToken = jwtToken;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
