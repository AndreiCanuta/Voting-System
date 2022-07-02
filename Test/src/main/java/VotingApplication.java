import controller.UserController;
import dto.UserDto;
import model.User;

public class VotingApplication {

    public static void main(String[] args) {
        UserController controller = new UserController();
        UserDto u1 = controller.createUser("andi");
        UserDto u2 = controller.createUser("cezar");
        controller.createRoom(u1, "room1");
        controller.createRoom(u1, "room2");
        controller.joinRoom(u2, "room1_1");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }

}
