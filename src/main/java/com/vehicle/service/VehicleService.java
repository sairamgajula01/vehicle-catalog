package com.vehicle.service;

import com.vehicle.model.Vehicle;
import com.vehicle.model.VehicleRequestDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;
    private ModelMapper modelMapper;


    public VehicleService(VehicleRepository vehicleRepository,ModelMapper modelMapper){
        this.vehicleRepository = vehicleRepository;
        this.modelMapper = modelMapper;
    }

    public long createVehicle(VehicleRequestDto vehicleRequestDto){
        Vehicle vehicle = modelMapper.map(vehicleRequestDto,Vehicle.class);
        Vehicle vehicle1 = vehicleRepository.save(vehicle);
        return vehicle1.getId();
    }

}
