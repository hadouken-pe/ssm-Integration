package com.hadouken.pe.controller;

import com.hadouken.pe.pojo.User;
import com.hadouken.pe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hadouken-pe@gmail.com
 * @date 2021-05-30 20:37:00
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "success";
    }

    @RequestMapping("/register")
    public String register(User user, Model model) {
        boolean status = userService.register(user);
        if (status) {
            model.addAttribute("user", user);
            return "success";
        } else {
            return "register";
        }
    }
}
