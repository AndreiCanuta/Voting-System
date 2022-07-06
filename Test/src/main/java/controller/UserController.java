package controller;

import exceptions.PasswordNotMatchingException;
import exceptions.UsernameUnavailableException;
import requests.LoginRequest;
import requests.RegisterRequest;
import service.UserService;

import javax.security.auth.login.CredentialException;

public class UserController {
    public UserService userService = new UserService();

    public String registerUser (RegisterRequest request){
        try {
            if (!request.getPassword().equals(request.getRepeatPassword())) {
                throw new PasswordNotMatchingException("Passwords do not match");
            } else {
                try {
                    userService.registerUser(request.getUsername(), request.getPassword());
                } catch (UsernameUnavailableException e) {
                    return e.getMessage().toString();
                }
            }
        }catch (PasswordNotMatchingException e) {
            return e.getMessage().toString();
        }
        return "200.OK";
    }

    public String loginUser (LoginRequest loginRequest) {
        try {
            userService.loginUser(loginRequest.getUsername(), loginRequest.getPassword());
        } catch (CredentialException e) {
            return e.getMessage().toString();
        }
    }

}
