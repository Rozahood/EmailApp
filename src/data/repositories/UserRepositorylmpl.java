package data.repositories;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositorylmpl implements UserRepository {
    private List<User> Users = new ArrayList<>();
    private int count = 0;

    private int generateUserId() {return count + 1;}
    private void saveNew(User user){}

    @Override
    public User findById(int id) {
        for(models.User User : Users){
            if(User.getId() == id) {
                return User;
            }
        }
        return null;
    }

    @Override
    public User save(User User) {
        boolean UserHasBeenSaved = User.getId() == 0;
        if (UserHasBeenSaved) {
            User.setId(generateUserId());
            saveNew(User);
        }
        return User;
    }

    @Override
    public int size() {return Users.size();}

    @Override
    public String delete(User User) {
        for (models.User userExist : Users){
            if (userExist == User){
                Users.remove(User);
                count--;
                return "user deleted";
            }
        }
        return "user does not exist";
    }

    @Override
    public String deleteAll(User User) {
        if (Users.isEmpty()){
            return "No user";
        }
        Users.clear();
        return "All users deleted";
    }
}
