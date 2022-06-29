package controller;

import service.UserService;

public class UserController {

    private final UserService userService = new UserService();

    public boolean checkUser (String username) {
        return userService.checkUser(username);
    }

    public String addUser (String email) {
        String[] split = email.split("@");
        String username = split[0];

        if (checkUser(username)) {
            return "User " + username + " already exists";
        }
        userService.addUser(email);
        return "User " + username + " added";
    }


}
