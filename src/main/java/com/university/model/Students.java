package com.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private  int StudentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
}
