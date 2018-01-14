package com.spring.rest.rest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    //GetAllUsers
    @GetMapping("/users")
    public List<User> allUserList(){
        return userDaoService.findAll();
    }

    //GetUser
    @GetMapping("/user/{id}")
    public User oneUser(@PathVariable int id){
        return userDaoService.findOne(id);
    }

    //AddUser
    @PostMapping("/userAdd")
    public ResponseEntity createUser(@RequestBody User user){
        User addUser = userDaoService.addUser(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/{id}")
                .buildAndExpand(addUser.getID()).toUri();
        return ResponseEntity.created(location).build();
    }
}
