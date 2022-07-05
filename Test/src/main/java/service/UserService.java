package service;

import exceptions.PasswordNotMatchingException;
import exceptions.UsernameUnavailableException;
import repository.UserRepository;

public class UserService {
    public UserRepository userRepository = new UserRepository();

    public void registerUser (String name, String password)
            throws UsernameUnavailableException {
        if (userRepository.checkUserByName(name)) {
            throw new UsernameUnavailableException("Username " + name + " already exists");
        } else {
            userRepository.registerUser(name, password);
        }
    }
}
