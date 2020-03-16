package com.vehicle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Column(name = "id")
    private long id;
    @Column(name = "vin")
    private String vin;
    @Column(name = "year")
    private int year;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "transmissionType")
    private String transmissionType;

}
