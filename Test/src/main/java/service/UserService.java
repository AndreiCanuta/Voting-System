package service;

import dto.UserDto;
import model.User;
import repository.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public User createUser (String name) {
        return userRepository.createUser(name);
    }

    public User createRoom (int id, String roomName) {
        return userRepository.createRoom(id, roomName);
    }

    public User joinRoom (int id, String roomLink) {
        return userRepository.joinRoom(id, roomLink);
    }

}
