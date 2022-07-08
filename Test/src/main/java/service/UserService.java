package service;

import entity.Cookie;
import exceptions.LoginException;
import exceptions.UsernameUnavailableException;
import repository.CookieRepository;
import repository.UserRepository;


public class UserService {
    public UserRepository userRepository = new UserRepository();
    public CookieRepository cookieRepository = new CookieRepository();

    public void registerUser (String name, String password)
            throws UsernameUnavailableException {
        if (userRepository.checkUserByName(name)) {
            throw new UsernameUnavailableException("Username " + name + " already exists");
        } else {
            userRepository.registerUser(name, password);
        }
    }

    public Cookie loginUser (String name, String password) throws LoginException {
            if (!userRepository.checkCredentials(name, password)) {
                throw new LoginException("Incorrect username or password");
            } else {
                int userId = userRepository.getUserId(name);
                if (cookieRepository.getCookie(userId) == null) {
                    throw new LoginException("User already logged in");
                } else {
                    return cookieRepository.getCookie(userId);
                }
            }
        }

    }

