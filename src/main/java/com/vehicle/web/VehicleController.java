package com.vehicle.web;

import com.vehicle.model.VehicleRequestDto;
import com.vehicle.service.VehicleService;
import com.vehicle.web.Valodator.VehicleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicle-api/v1/vehicles/vehicle")
public class VehicleController {

    private VehicleService vehicleService;
    private VehicleValidator vehicleValidator;

    @Autowired
    public VehicleController(VehicleService vehicleService,VehicleValidator vehicleValidator){
        this.vehicleService = vehicleService;
        this.vehicleValidator = vehicleValidator;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public long createVehicle(@RequestBody  VehicleRequestDto vehicleRequestDto) throws BindException {
        BindingResult errors =  vehicleValidator.validateVehicleRequest(vehicleRequestDto);
        if(errors.hasErrors()){
            throw new BindException(errors);
        }
        return vehicleService.createVehicle(vehicleRequestDto);
    }

}
