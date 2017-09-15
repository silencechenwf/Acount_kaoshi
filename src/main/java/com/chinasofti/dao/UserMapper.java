package com.chinasofti.dao;

import com.chinasofti.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/7/21.
 */
public interface UserMapper {
    public User login(@Param("userName") String userName,@Param("passWord") String passWord);
    public void register(User user);
}
