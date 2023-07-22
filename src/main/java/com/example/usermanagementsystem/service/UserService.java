package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.model.User;
import com.example.usermanagementsystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String createUsers(List<User> users) {
        List<User> originalList = getAllUsers();
        originalList.addAll(users);
        return "New users added";
    }

    public String createUser(List<User> user) {
        List<User> originalList = getAllUsers();
        originalList.addAll(user);
        return "New Users added";
    }

    public String removeUser(Integer id) {
        List<User> originalList = getAllUsers();
        for(User u: originalList) {
            if(id.equals(u.getUserId())) {
                originalList.remove(u);
                return "removed";
            }
        }
        return "Id not found";
    }

    public String updateEmail(Integer id, String emailId) {
        List<User> originalList = getAllUsers();
        for(User u : originalList) {
            if(id.equals(u.getUserId())) {
                u.setUserEmail(emailId);

                return  "Email updated";
            }
        }
        return "id not found";
    }
}
