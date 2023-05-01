package controllers;

import dtos.requests.adminRequest;
import services.UserServiceslmpl;

@RestControloler
public class UserController {
    private services.UserService UserService = new UserServiceslmpl();


    public Object register(@RequestBody adminRequest request){
        try {
            return services.UserService.register(request);
        }catch (IllegalArgumentException ex){
            return ex.getMessage();
        }
    }

    public FindUserResponse findUserById(int id){
        return services.UserService.findUser(id);
    }
}
}
