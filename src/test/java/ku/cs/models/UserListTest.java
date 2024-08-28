package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("a", "1");
        userList.addUser("b", "2");
        userList.addUser("c", "3");
        // TODO: find one of them
        userList.findUserByUsername("a");
        // TODO: assert that UserList found User
        User user = userList.findUserByUsername("a");
        String expected = "a";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("a", "1");
        userList.addUser("b", "2");
        userList.addUser("c", "3");
        // TODO: change password of one user
        boolean actual = userList.changePassword("a", "1", "111");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("a", "1");
        userList.addUser("b", "2");
        userList.addUser("c", "3");
        // TODO: call login() with correct username and password
        User actual = userList.login("a", "1");
        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("a");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("a", "1");
        userList.addUser("b", "2");
        userList.addUser("c", "3");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("a", "2");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}