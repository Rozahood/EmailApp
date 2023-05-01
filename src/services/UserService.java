package services;

import models.User;
import dtos.requests.adminRequest;

public interface UserService {
    User register(adminRequest request);
    static FindUserResponse findUser(int id);
    void delete(User User);
    void delete(int id);
}
