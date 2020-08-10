package com.hqyj.Boot001.modules.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/userDesc")
    @ResponseBody
    public String testDesc() {
        return "This is user module desc.";
    }
}
