package com.exercisedtoresponseentity.exercisedtoresponseentity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private Integer id;
    private String place;
    private String description;
    private double longitude;
    private double latitude;
}
