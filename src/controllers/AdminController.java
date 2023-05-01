package controllers;

import dtos.requests.adminRequest;
import services.AdminServiceslmpl;

public class AdminController {

    private services.AdminServices AdminServices = new AdminServiceslmpl();

    public Object createPost(adminRequest request) {return services.AdminServices.adminRequest((services.AdminServices) request); }

    public Object findPost(int id) {
        try{
            return services.AdminServices.findAdmin(id);
        } catch(IllegalAccessException e) {
            return e.getMessage();
        }
    }
}