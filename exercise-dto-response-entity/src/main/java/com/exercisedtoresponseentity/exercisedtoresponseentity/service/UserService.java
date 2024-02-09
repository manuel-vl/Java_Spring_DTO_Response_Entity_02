package com.exercisedtoresponseentity.exercisedtoresponseentity.service;

import com.exercisedtoresponseentity.exercisedtoresponseentity.dto.UserLocationDTO;
import com.exercisedtoresponseentity.exercisedtoresponseentity.model.Location;
import com.exercisedtoresponseentity.exercisedtoresponseentity.model.User;
import com.exercisedtoresponseentity.exercisedtoresponseentity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<UserLocationDTO> listUserLocation=new ArrayList<>();

    public List<UserLocationDTO> getAllUsersLocation(){
        return  listUserLocation;
    }

    public UserLocationDTO convert(User user, Location location){
        UserLocationDTO userLocationDTO=new UserLocationDTO();

        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(location.getPlace());
        userLocationDTO.setLatitude(location.getLatitude());
        userLocationDTO.setLongitude(location.getLongitude());

        listUserLocation.add(userLocationDTO);

        return userLocationDTO;
    }
}
