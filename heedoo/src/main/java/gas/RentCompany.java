package gas;

import gas.cars.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class RentCompany {
    private List<Car> rentCars;

    private RentCompany() {
        this.rentCars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        rentCars.add(car);
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
        rentCars.stream()
                .forEach(car -> stringBuilder.append(car.getName() + " : " + car.gasNeed() + "리터" + "\n"));

        return stringBuilder.toString();
    }
}
