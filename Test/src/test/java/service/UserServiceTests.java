package service;

import exceptions.UsernameUnavailableException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import service.UserService;
public class UserServiceTests {
    private UserService userService;
    @BeforeEach
    public void initializing() {
        userService = new UserService();
    }
    @Test
    public void testRegisterThrowsException() {
        try {
            userService.registerUser("Ana","123");
            userService.registerUser("Ana","123");
            fail("Expected exception was not thrown");
        } catch (UsernameUnavailableException e) {
            assertNotNull(e);
        }
    }
    @Test
    public void testRegisterSuccessful() {
        try {
            userService.registerUser("Adi","123");
        } catch (UsernameUnavailableException e) {
            fail("User could not login");
        }
    }
//assertTrue
//assertNotNull
}