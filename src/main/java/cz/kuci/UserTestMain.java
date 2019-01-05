package cz.kuci;

public class UserTestMain {
    public static void main(String[] args) {
        if(args.length==0) {
            return;
        }

        UserService userService = null;
        String type = args[0].toString();
        if(type.equals("prod")) {
            userService = new UserServiceImpl();
        } else if(type.equals("test")) {
            userService = new UserServiceMock();
        } else {
            throw new IllegalArgumentException("neplatny identifikator prostredi");
        }

        System.out.println(userService.getUsername());
    }
}
