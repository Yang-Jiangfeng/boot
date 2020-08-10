package com.hqyj.Boot001.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/testDesc")
    @ResponseBody
    public String testDesc() {
        return "This is test module desc.";
    }
}
