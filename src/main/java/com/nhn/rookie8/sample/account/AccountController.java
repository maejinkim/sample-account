package com.nhn.rookie8.sample.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/helloworld")
    @ResponseBody
    public String hello() {
        return "hello, World!";
    }
}
