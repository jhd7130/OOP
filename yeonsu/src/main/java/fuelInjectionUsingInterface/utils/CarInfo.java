package fuelInjectionUsingInterface.utils;

import fuelInjectionUsingInterface.domain.RentCar;

@FunctionalInterface
public interface CarInfo {

    String carInfo(RentCar rentCar);
}
