package service;

import entity.Cookie;
import exceptions.PasswordNotMatchingException;
import exceptions.UsernameUnavailableException;
import repository.CookieRepository;
import repository.UserRepository;

import javax.security.auth.login.CredentialException;

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

    public Cookie loginUser (String name, String password) throws CredentialException {
        if (!userRepository.checkCredentials(name, password)) {
            throw new CredentialException("Wrong credentials");
        } else {
            int userId = userRepository.getUserId(name);
            cookieRepository.addCookie(userId);
            return cookieRepository.getCookie(userId);
        }

    }
}
