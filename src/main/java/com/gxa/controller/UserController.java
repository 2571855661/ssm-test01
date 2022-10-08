package com.gxa.controller;


import com.gxa.entity.User;
import com.gxa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public String login(User user, HttpSession session){



        User user1 = this.userService.login(user.getUserName(), user.getPwd());
        if (user1 != null){
            session.setAttribute("user",user1);
            return "redirect:/main.html";
        }else
            return "redirect:/index.html";
    }

}
