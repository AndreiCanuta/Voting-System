package controller;

import dto.UserDto;
import mapper.MapperService;
import model.Room;
import service.RoomService;
import service.UserService;

public class UserController {
    private final UserService userService = new UserService();
    private final MapperService mapperService = new MapperService();
    private final RoomService roomService = new RoomService();

    public UserDto createUser (String name) {
        return mapperService.toDto(userService.createUser(name));
    }

    public UserDto createRoom (UserDto userDto, String roomName) {
        int id = mapperService.getIdFromDto(userDto);
        return mapperService.toDto(userService.createRoom(id, roomName));
    }

    public UserDto joinRoom (UserDto userDto, String roomLink) {
        int id = mapperService.getIdFromDto(userDto);
        Room room = roomService.getRoom(roomLink);
        return mapperService.toDto(userService.joinRoom(id, room));
    }

    public UserDto vote (UserDto userDto, String roomLink, int vote) {
        int id = mapperService.getIdFromDto(userDto);
        Room room = roomService.getRoom(roomLink);
        UserDto returnUserDto =  mapperService.toDto(userService.vote(id, room, vote));
        roomService.updateAverageVote(room);
        return returnUserDto;
    }
}
