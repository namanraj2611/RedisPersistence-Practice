package com.naman.redis.practice.Redis.Practice.daos;

import com.naman.redis.practice.Redis.Practice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDAO{

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String KEY = "USER_KEY";


    //save user

    public User save(User user) {
        redisTemplate.opsForHash().put(KEY, user.getUserId(), user);
        return user;
    }

    public User get(String userId) {
        return (User) redisTemplate.opsForHash().get(KEY, userId);
    }

    //find all

    public Map<Object, Object> findAll() {
        return redisTemplate.opsForHash().entries(KEY);
    }

    // delete

    public void delete(String userId) {
        redisTemplate.opsForHash().delete(KEY, userId);
    }


}