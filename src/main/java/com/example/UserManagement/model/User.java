package com.example.UserManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;
}
