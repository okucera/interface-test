package cz.kuci;

public class UserTestMock {
    public static void main(String[] args) {
        UserService userService = new UserServiceMock();
        System.out.println(userService.getUsername());
    }
}
