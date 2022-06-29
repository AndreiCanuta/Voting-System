package controller;

import service.VoteService;

public class VoteController {
    private final VoteService voteService = new VoteService();
    private final UserController userController = new UserController();



    public boolean checkVote (String username) {
        return voteService.checkVote(username);
    }

    public String addVote (String username) {
        if (userController.checkUser(username)) {
            if (!voteService.checkVote(username)) {

                voteService.addVote(username);
                return "Vote added for " + username;

            } else return username + " already voted";
        } else return username + " doesn't exist";
    }

    public String removeVote (String username) {
        if (checkVote(username)) {
            voteService.removeVote(username);
            return "Vote removed for " + username;
        } else return username + " didn't vote";

    }

}
