package com.devansh.Restaurant.dao;

import com.devansh.Restaurant.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
