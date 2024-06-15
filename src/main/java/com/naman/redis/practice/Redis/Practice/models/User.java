package com.naman.redis.practice.Redis.Practice.models;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 6529685098267757694L;


    private String userId;
    private String name;
    private String phone;
    private String email;

}
