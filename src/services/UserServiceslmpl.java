package services;

import models.User;
import dtos.requests.adminRequest;

public class UserServiceslmpl implements UserService {
    @Override
    public User register(adminRequest request) {
        if (userExist(
    }

    @Override
    public FindUserResponse findUser(int id) {
        return null;
    }

    @Override
    public void delete(User User) {

    }

    @Override
    public void delete(int id) {

    }
}
