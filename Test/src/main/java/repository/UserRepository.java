package repository;

import data.DataUsers;
import dto.UserDto;
import model.Room;
import model.User;

public class UserRepository {
    private final DataUsers dataUsers = DataUsers.getInstance();

    public User createUser (String name) {
        User user = new User (name);
        dataUsers.data.put(user.getID(), user);
        return user;
    }

    public User createRoom (int id, String roomName) {

        User user = dataUsers.data.get(id);
        Room room = new Room(roomName);
        room.setLink(roomName + "_" + id);
        User auxUser = new User(user.getName(), id, "Moderator");
        room.getUserList().add(auxUser);
        user.getRoomList().add(room);

        return user;
    }

    public User joinRoom (int id, Room room) {
        User userJoin = dataUsers.data.get(id);
        User auxUser = new User (userJoin.getName(), id, "Player");
        userJoin.getRoomList().add(room);
        room.getUserList().add(auxUser);

        return userJoin;
    }


}
