package cz.kuci;

public class UserServiceImpl implements UserService{
    IAMService iamService = new IAMService();

    @Override
    public String getUsername() {
        return iamService.getUsername();
    }
}
