package cz.kuci;

public class UserTestProd {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        System.out.println(userService.getUsername());
    }
}
