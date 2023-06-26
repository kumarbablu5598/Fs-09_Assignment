package com.example.UserManagement.repository;

import com.example.UserManagement.model.User;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class UserDao {
    List<User> userList = new ArrayList<>();
    public List<User> getUsers() {
        return userList;
    }
    public String save(User user) {
        userList.add(user);
        return "Added Successfully!!";
    }



    public Boolean removeUser(User user) {
        userList.remove(user);
        return true;
    }

    public Boolean updateUserById(String userid, User user) {
        for ( User userObj : userList )
        {
            if ( userObj.getUserId().equals(userid) )
            {
                userObj.setUserName(user.getUserName());
                userObj.setUserName(user.getUserName());
                userObj.setEmailId(user.getEmailId());
                userObj.setPhoneNumber(user.getPhoneNumber());
                userObj.setDOB(user.getDOB());
                return true;
            }
        }
        return false;
    }
}
