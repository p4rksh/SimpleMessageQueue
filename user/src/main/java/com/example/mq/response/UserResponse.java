package com.example.mq.response;

import com.example.mq.dto.User;
import com.example.mq.enums.ReturnCode;
import lombok.Getter;

@Getter
public class UserResponse extends DefaultResponse {

    private User user;

    public UserResponse(ReturnCode returnCode, User user) {
        super(returnCode.getReturnCode(), returnCode.getReturnMessage());
        this.user = user;
    }
}
