package service;

import repository.UserRepository;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public boolean checkUser (String username) {
        return userRepository.checkUser(username);
    }

    public void addUser (String email) {
        userRepository.addUser(email);
    }

}
