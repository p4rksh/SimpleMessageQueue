package com.example.mq.controller;

import com.example.mq.enums.ReturnCode;
import com.example.mq.response.UserResponse;
import com.example.mq.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{userId}")
    @ResponseBody
    public UserResponse getUserInfo(@PathVariable("userId") long userId) throws Exception{

        return new UserResponse(ReturnCode.SUCCESS, userService.getUserInfo(userId));
    }
}
