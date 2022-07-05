package entity;

public class User {
    private static int globalId = 0;
    private int id;
    private String name;
    private String password;

    public User () {}

    public User (String name, String password) {
        globalId++;
        this.id = globalId;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
