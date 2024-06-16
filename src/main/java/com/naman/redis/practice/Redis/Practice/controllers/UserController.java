package com.naman.redis.practice.Redis.Practice.controllers;

import com.naman.redis.practice.Redis.Practice.daos.UserDAO;
import com.naman.redis.practice.Redis.Practice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/naman-redis/users")
public class UserController {

    @Autowired
    private UserDAO userDao;


    // create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userDao.save(user);
    }

    //get single user

    @GetMapping("/{enterHereTheUserId}")
    public User getUser(@PathVariable("enterHereTheUserId") String userId) {
        return userDao.get(userId);
    }

    //find all
    @GetMapping
    public List<User> getAll() {

        Map<Object, Object> all = userDao.findAll();
        Collection<Object> values = all.values();
        return values.stream().map(value -> (User) value).collect(Collectors.toList());

    }

    //delete  user
    @DeleteMapping("/{enterHereTheUserId}")
    public String deleteUser(@PathVariable("enterHereTheUserId") String userId) {
        userDao.delete(userId);
        return String.format("User with userId: %s, is Succesfully Deleted", userId);
    }

}