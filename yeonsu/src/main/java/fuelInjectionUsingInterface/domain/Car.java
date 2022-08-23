package fuelInjectionUsingInterface.domain;

import fuelInjectionUsingInterface.utils.CarRandomAnnualFuel;
import fuelInjectionUsingInterface.utils.DoubleToString;
import fuelInjectionUsingInterface.wrapper.CarName;

import java.util.Random;

public class Car implements RentCar {

    private CarName carName;
    private int kilo;
    private static int annualFuel;

    private Car(String carName, int kilo) {
        this.carName = new CarName(carName);
        this.kilo = kilo;
    }

    public static RentCar from(String carName, int kilo) {
        annualFuel = CarRandomAnnualFuel.randomAnnualFuel();
        return new Car(carName, kilo);
    }

    @Override
    public String rentCarName() {
        return carName.currentCarName();
    }
    @Override
    public double totalDistance() {
        return kilo;
    }

    @Override
    public String  distancePerAnnualFuel() {
        return DoubleToString.changeType(kilo/annualFuel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (kilo != car.kilo) return false;
        return carName != null ? carName.equals(car.carName) : car.carName == null;
    }

    @Override
    public int hashCode() {
        int result = carName != null ? carName.hashCode() : 0;
        result = 31 * result + kilo;
        return result;
    }
}
