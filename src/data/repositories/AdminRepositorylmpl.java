package data.repositories;

import models.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminRepositorylmpl implements AdminRepository {
    private List<Admin>admins = new ArrayList<>();
    private int count = 0;
    private Admin admin;

    private int generateAdminId() {return count + 1;}

    @Override
    public Admin findById(int id) {
        for(models.Admin Admin : admins){
            if(Admin.getId() == id){return Admin;}
        }
        return null;
    }

    @Override
    public Admin save(Admin Admin) {
        boolean adminHasBeenSaved = Admin.getId() == 0;
        if(adminHasBeenSaved){
            Admin.setId(generateAdminId());
            save(Admin);
        }
        return Admin;
    }

    @Override
    public int size() {return admins.size();}

    @Override
    public String delete(Admin Admin) {
        for(models.Admin adminExist : admins){
            if (adminExist == admin){
                admins.remove(admin);
                count--;
                return "Admin deleted";
            }
        }
        return "Admin does not exist";
    }

    @Override
    public String deleteAll(Admin Admin) {
        if (admins.isEmpty()){
            return "No admin";
        }
        admins.clear();
        return "All admin deleted";
    }
}
