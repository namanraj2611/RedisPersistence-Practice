package com.naman.redis.practice.Redis.Practice.models;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -5860399943409455301L;
    private String userId;
    private String name;
    private String phone;
    private String email;
}
