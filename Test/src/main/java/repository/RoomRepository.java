package repository;

import data.DataUsers;
import dto.UserDto;
import model.Room;
import model.User;

public class RoomRepository {
    private final DataUsers dataUsers = DataUsers.getInstance();

    public Room getRoom (String roomLink) {
        String[] split = roomLink.split("_");
        User user = dataUsers.data.get(Integer.parseInt(split[1]));

        for(Room r : user.getRoomList()) {
            if (r.getLink().equals(roomLink)) {
                return r;
            }
        }
        return null;
    }

    public void updateAverageVote (Room room) {
        int nrVotes = 0;
        int sum = 0;
        for (User u : room.getUserList()) {
            if (u.getVote() != 0) {
                nrVotes++;
                sum += u.getVote();
            }
        }
        room.setAverageVote(sum/nrVotes);
    }


}
