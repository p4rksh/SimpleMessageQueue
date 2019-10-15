package com.example.mq.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ReturnCode {

    SUCCESS(200, "request success");

    private int returnCode;
    private String returnMessage;
}
