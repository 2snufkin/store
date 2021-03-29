package fr.project.store.Controllers;

import fr.project.store.Entites.User;
import fr.project.store.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddControler {

    private UserService userService;

    @Autowired
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(){
        return "add";
    }

    @PostMapping(path = "/addUser")
    public String addUser(User user){
        user.setEmail("email");
        user.setUserName("snuf");
        user.setPassword("password");
       int a =  userService.addUser(user);
        return "add";
    }
}
