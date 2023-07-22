package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.model.User;
import com.example.usermanagementsystem.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //read
    @GetMapping("users")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //create
    @PostMapping("users")
    String addUsers(@Valid @RequestBody List<User> users) {
        return userService.createUsers(users);
    }

    @PostMapping("user")
    String addUser(@Valid @RequestBody List<User> user) {
        return  userService.createUser(user);
    }

    //delete :
    @DeleteMapping("user")
    String removeUser(@RequestParam @Max(10000) Integer id) {
        return  userService.removeUser(id);
    }

    @RequestMapping(value = "user/{id}/email/{emailId}",method = PUT)
    String updateEmail(@PathVariable Integer id, @PathVariable @Email String emailId)
    {
        return userService.updateEmail(id,emailId);
    }
}