package com.example.mq.service.user.impl;

import com.example.mq.dto.User;
import com.example.mq.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public User getUserInfo(long userId) {

        return new User().builder()
                         .userId(userId)
                         .name("박상훈")
                         .age(24)
                         .build();
    }
}
