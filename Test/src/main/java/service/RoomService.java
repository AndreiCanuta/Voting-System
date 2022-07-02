package service;

import dto.UserDto;
import model.Room;
import repository.RoomRepository;

public class RoomService {
    private final RoomRepository roomRepository = new RoomRepository();

    public Room getRoom (String link) {
        return roomRepository.getRoom (link);
    }
}
