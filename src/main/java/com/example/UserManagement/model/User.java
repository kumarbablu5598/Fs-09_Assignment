package com.example.UserManagement.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @NotBlank(message = "userId not Blank")
    private String userId;

    @NotEmpty(message = "UserName not empty")
    private String userName;
   @Email
   @NotEmpty(message = "must be a well-formed email")
    private String EmailId;

    @Size(min = 10,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNumber;
    @Size(min = 8,max = 10)
    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$")
    private String DOB;

}
