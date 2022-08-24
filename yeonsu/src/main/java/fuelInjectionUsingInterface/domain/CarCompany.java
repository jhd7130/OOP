package fuelInjectionUsingInterface.domain;

import fuelInjectionUsingInterface.utils.CarInfo;
import fuelInjectionUsingInterface.utils.CarInfoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarCompany {
    private List<RentCar> rentCars;

    public static CarCompany create() {
        return new CarCompany();
    }

    private CarCompany() {
        rentCars = new ArrayList<>();
    }

    public List<RentCar> currentCanUseCarList() {
        return rentCars;
    }


    public void addCar(String carName, int kilo) {
        rentCars.add(Car.from(carName, kilo));
    }

    public String report(CarInfoImpl carInfo) {
        return rentCars.stream().map(x -> carInfo.carInfo(x)).collect(Collectors.joining());
    }
}
