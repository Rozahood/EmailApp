package data.repositories;

import models.User;

public interface UserRepository {
    User findById(int id);
    User save(User User);
    int size();
    String delete(User User);
    String deleteAll(User User);
}
