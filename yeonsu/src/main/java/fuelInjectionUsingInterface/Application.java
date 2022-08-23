package fuelInjectionUsingInterface;

import fuelInjectionUsingInterface.domain.Car;
import fuelInjectionUsingInterface.domain.CarCompany;
import fuelInjectionUsingInterface.utils.CarInfoImpl;

public class Application {
    public static void main(String[] args) {
        CarCompany carCompany = CarCompany.create();
        carCompany.addCar("Genesis", 300);
        carCompany.addCar("Hyundai", 200);
        carCompany.addCar("Toyoda", 450);
        carCompany.addCar("Lexus", 290);

        String report = carCompany.report(new CarInfoImpl());
        System.out.println(report);

    }
}
