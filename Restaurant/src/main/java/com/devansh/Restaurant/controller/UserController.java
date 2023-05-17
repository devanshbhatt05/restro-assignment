package com.devansh.Restaurant.controller;

import com.devansh.Restaurant.model.Restaurant;
import com.devansh.Restaurant.model.User;
import com.devansh.Restaurant.service.RestaurantService;
import com.devansh.Restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveusers")
    public String saveusers(@RequestBody() List<User> users){
        return userService.saveUsers(users);
    }

    @GetMapping("/getusers")
    public List<User> getusers(){
        return userService.getUsers();
    }

    @GetMapping("/getuser")
    public Optional<User> getuser(@RequestParam("userId") Integer userId){
        return userService.getUser(userId);
    }

    @PutMapping("/updateuser")
    public String updateuser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteuser")
    public String deleteuser(@RequestParam("id")Integer id){
        return userService.deleteUser(id);
    }
}
