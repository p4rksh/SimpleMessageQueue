package com.example.mq.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DefaultResponse {

    int returnCode;
    String returnMessage;
}
