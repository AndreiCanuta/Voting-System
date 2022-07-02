package service;

import dto.UserDto;
import model.Room;
import repository.RoomRepository;

public class RoomService {
    private final RoomRepository roomRepository = new RoomRepository();

    public Room getRoom (String roomLink) {
        return roomRepository.getRoom (roomLink);
    }

    public void updateAverageVote (Room room) {
        roomRepository.updateAverageVote(room);
    }
}
