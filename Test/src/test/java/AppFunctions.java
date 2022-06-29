import controller.UserController;
import controller.VoteController;

public class AppFunctions {
    public VoteController voteController = new VoteController();
    public UserController userController = new UserController();

    public void run () {
        System.out.println(voteController.removeVote("andi.canuta"));
        System.out.println(voteController.addVote("andi.canuta"));
        System.out.println(userController.addUser("andi.canuta@gmail.com"));
        System.out.println(userController.addUser("andi.canuta@gmail.com"));
        System.out.println(voteController.addVote("andi.canuta"));
        System.out.println(voteController.addVote("andi.canuta"));
        System.out.println(voteController.removeVote("andi.canuta"));
        System.out.println(voteController.removeVote("andi.canuta"));

    }

}
