package com.user.user.services;

import com.user.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> user=new ArrayList<>();
    // private static int count =0;
    static {
        user.add(new User(10,"Bablu","kumarbablu5598","kolkata,saltlake sector-1","9748658517"));
        user.add(new User(20,"Rohan","rahulkumar@234","delhi ,dp road","9847685147"));
        user.add(new User(30,"Ravi","raviyadav56@","Kanpur,BD road ","9748658516"));

    }
    public List<User> finaAll() {
        return user;
    }

    public User getUserById(int UserId)
    {
        User ur=user.get(UserId);

        return ur;
    }
    public void addUser(User userDetails) {
        user.add(userDetails);

    }
    public void deleteById(int UserId) {
        user.remove(UserId);

    }

    public void updateById(int UserId, User user1) {

        User userUpdate=getUserById(UserId);

        userUpdate.setName(user1.getName());
        userUpdate.setNumber(user1.getNumber());
        userUpdate.setAddress(user1.getAddress());
        userUpdate.setUserName(user1.getUserName());
    }

}
