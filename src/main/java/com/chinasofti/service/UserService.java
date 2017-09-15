package com.chinasofti.service;

import com.chinasofti.dao.UserMapper;
import com.chinasofti.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/21.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;


    public User login(String userName, String passWord) {
        User user = mapper.login(userName,passWord);
        return user;
    }

    public void register(User user) {
        mapper.register(user);
    }
}
