package entity;

public class Room {
    private static int globalId = 0;
    private int id;
    private String name;
    private int ownerId;
    private String link;

    public Room(String name, int ownerId) {
        globalId++;
        this.id = globalId;
        this.name = name;
        this.ownerId = ownerId;
        this.link = "join/" + ownerId + "/" + name;
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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
