package com.vehicle.web.Valodator;

import com.vehicle.model.VehicleRequestDto;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

@Component
public class VehicleValidator {

    public BindingResult validateVehicleRequest(VehicleRequestDto vehicleRequestDto){
        BindingResult errors = new BeanPropertyBindingResult(vehicleRequestDto,"vehicleRequestDto");
        validateTransmissionType(vehicleRequestDto,errors);
        return errors;
    }

    private void validateTransmissionType(VehicleRequestDto vehicleRequestDto,BindingResult errors){

    }
}
