package com.vehicle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleRequestDto {

    private String vin;
    private int year;
    private String make;
    private String model;
    private String transmissionType;
}
