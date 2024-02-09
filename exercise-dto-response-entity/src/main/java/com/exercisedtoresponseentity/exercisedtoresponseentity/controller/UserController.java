package com.exercisedtoresponseentity.exercisedtoresponseentity.controller;

import com.exercisedtoresponseentity.exercisedtoresponseentity.dto.UserLocationDTO;
import com.exercisedtoresponseentity.exercisedtoresponseentity.model.Location;
import com.exercisedtoresponseentity.exercisedtoresponseentity.model.User;
import com.exercisedtoresponseentity.exercisedtoresponseentity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }

    @PostMapping("/users-location")
    public UserLocationDTO addUsersLocation(@RequestBody User user){
        Location location=new Location(1, "Bancolombia","Banco de Colombia", 134.5, 678.14);

        UserLocationDTO userLocationDTO= userService.convert(user,location);

        return userLocationDTO;
    }
}
