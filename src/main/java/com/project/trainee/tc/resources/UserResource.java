package com.project.trainee.tc.resources;

import com.project.trainee.tc.entities.User;
import com.project.trainee.tc.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createdUser(@RequestBody User user){
        userService.create(user);
    }
}
