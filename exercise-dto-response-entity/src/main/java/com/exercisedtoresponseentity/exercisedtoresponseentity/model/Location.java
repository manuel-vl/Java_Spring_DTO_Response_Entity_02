package com.exercisedtoresponseentity.exercisedtoresponseentity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private Long id;
    private String place;
    private String description;
    private Double longitude;
    private Double latitude;
}
