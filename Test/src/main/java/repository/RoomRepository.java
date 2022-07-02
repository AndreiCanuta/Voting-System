package repository;

import data.DataUsers;
import dto.UserDto;
import model.Room;
import model.User;

public class RoomRepository {
    private final DataUsers dataUsers = DataUsers.getInstance();

    public Room getRoom (String link) {
        String[] split = link.split("_");
        User user = dataUsers.data.get(Integer.parseInt(split[1]));

        for(Room r : user.getRoomList()) {
            if (r.getName().equals(split[0])) {
                return r;
            }
        }
        return null;
    }


}
