package fuelInjectionUsingInterface.wrapper;

public class CarName {

    private String carName;

    public CarName(String carName) {
        if (carName.length() > 10) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
    }

    public String currentCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarName)) return false;

        CarName carName1 = (CarName) o;

        return carName != null ? carName.equals(carName1.carName) : carName1.carName == null;
    }

    @Override
    public int hashCode() {
        return carName != null ? carName.hashCode() : 0;
    }
}
