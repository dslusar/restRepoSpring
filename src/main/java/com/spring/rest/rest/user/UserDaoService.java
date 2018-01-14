package com.spring.rest.rest.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> userList = new ArrayList<>();
    private static int UserCount = 3;
    static {
        userList.add(new User(1,"Adam", new Date()));
        userList.add(new User(2, "Mieczysław", new Date()));
        userList.add(new User(3, "Bohun", new Date()));
    }

    public List<User> findAll(){
        return userList;
    }

    public User addUser(User user){
        if (user.getID() == null){
                user.setID(++UserCount);
        }
        userList.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user: userList){
            if (user.getID() == id){
                return user;
            }
        }
        return null;
    }

}
