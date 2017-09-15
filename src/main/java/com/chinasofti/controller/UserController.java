package com.chinasofti.controller;

import com.chinasofti.pojo.User;
import com.chinasofti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/7/21.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public ModelAndView login(@RequestParam("userName") String userName , @RequestParam("passWord") String passWord){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.login(userName, passWord);
        modelAndView.addObject("user",user);
        modelAndView.setViewName("/index.jsp");
        System.out.println(user);
        return modelAndView;
    }
    @RequestMapping("register")
    public String register(User user){
        ModelAndView modelAndView = new ModelAndView();
        userService.register(user);
        System.out.println(user);
        return  "/login.jsp";
    }
}
