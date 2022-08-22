package carRacing.wrapper;

import carRacing.exception.CarNameOutOfRangeException;
import carRacing.utils.ConsoleOut;

public class CarName {
    private String name;

    public CarName(String name) {
        if (isNotCarName(name)) {
            throw new CarNameOutOfRangeException(ConsoleOut.CAR_NAME_EXCEPTION_MESSAGE);
        }
        this.name = name;
    }

    private boolean isNotCarName(String name) {
        return name.length() > ConsoleOut.CAR_NAME_LENGTH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarName)) return false;

        CarName carName = (CarName) o;

        return name != null ? name.equals(carName.name) : carName.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
