package controller;

import dto.UserDto;
import mapper.MapperService;
import service.UserService;

public class UserController {
    private UserService userService = new UserService();
    private MapperService mapperService = new MapperService();

    public UserDto createUser (String name) {
        return mapperService.toDto(userService.createUser(name));
    }

    public UserDto createRoom (UserDto userDto, String roomName) {
        int id = mapperService.getIdFromDto(userDto);
        return mapperService.toDto(userService.createRoom(id, roomName));
    }

    public UserDto joinRoom (UserDto userDto, String roomLink) {
        int id = mapperService.getIdFromDto(userDto);
        return mapperService.toDto(userService.joinRoom(id, roomLink));
    }
}
