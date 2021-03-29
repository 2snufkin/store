package fr.project.store.Services;

import fr.project.store.Entites.User;
import fr.project.store.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public int addUser(User user){
        int id = userRepo.save(user).getId();
        return id;

    }

    public void deleteUser(int id){
        User user = userRepo.getOne(id);
         userRepo.delete(user);
    }

    public Optional<User> searchUserById(int id){
        Optional<User> user = userRepo.findById(id);
        return user;
    }

    public void updateUser(String userName, String pass, int id){
        userRepo.setUserInfoById(userName, pass, id);
    }
}
