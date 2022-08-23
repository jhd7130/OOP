package fuelInjectionUsingInterface.utils;

import fuelInjectionUsingInterface.domain.RentCar;

public class CarInfoImpl implements CarInfo {

    @Override
    public String carInfo(RentCar rentCar) {
        return rentCar.rentCarName() + " : " + rentCar.distancePerAnnualFuel() + "리터\n";
    }
}
