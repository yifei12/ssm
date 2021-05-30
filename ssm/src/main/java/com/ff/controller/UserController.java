package com.ff.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String UserLogin(@RequestParam("username") String username, @RequestParam("password") String password) {

        return "index";
    }
}
