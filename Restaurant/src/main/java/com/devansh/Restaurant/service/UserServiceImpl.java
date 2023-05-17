package com.devansh.Restaurant.service;

import com.devansh.Restaurant.dao.UserDao;
import com.devansh.Restaurant.model.Restaurant;
import com.devansh.Restaurant.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public String saveUsers(List<User> users) {
        userDao.saveAll(users);
        return "User saved "+users.size();
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public Optional<User> getUser(Integer userId) {
        return (Optional<User>) userDao.findById(userId);
    }

    @Override
    public String updateUser(User user) {
        userDao.save(user);
        return "user updated";
    }

    @Override
    public String deleteUser(Integer id) {
        userDao.deleteById(id);
        return "user deleted";
    }
}
