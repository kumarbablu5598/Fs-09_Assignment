package com.university.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Students {
    @Id
    private  int StudentId;
    @Pattern(regexp = "^[A-z][a-z0-9_-]{3,19}$")
    private String firstName;
    private String lastName;
    @Min(value = 18,message = "Age must be greater than 18")
    @Max(value = 25,message = "Age must be smaller than 25")
    private int age;
    private String department;
}
