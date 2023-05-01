package data.repositories;

import models.Admin;

public interface AdminRepository {
    Admin findById(int id);
    Admin save(Admin Admin);
    int size();
    String delete(Admin Admin);
    String deleteAll(Admin Admin);
}