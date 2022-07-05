package controller;

import exceptions.PasswordNotMatchingException;
import exceptions.UsernameUnavailableException;
import requests.RegisterRequest;
import service.UserService;

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
                    return e.toString();
                }
            }
        }catch (PasswordNotMatchingException e) {
            return e.toString();
        }
        return "200.OK";
    }
}
