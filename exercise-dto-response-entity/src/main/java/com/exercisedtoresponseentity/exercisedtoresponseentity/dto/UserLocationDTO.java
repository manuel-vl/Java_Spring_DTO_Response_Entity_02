package com.exercisedtoresponseentity.exercisedtoresponseentity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserLocationDTO {
    // User params
    private Integer userId;
    private String email;
    // Location params
    private String place;
    private double longitude;
    private double latitude;
}
