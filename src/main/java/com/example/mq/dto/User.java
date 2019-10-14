package com.example.mq.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private long userId;
    private String name;
    private int age;
}
