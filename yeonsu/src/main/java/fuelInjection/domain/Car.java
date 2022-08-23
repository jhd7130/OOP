package fuelInjection.domain;

import java.text.DecimalFormat;

public abstract class Car {

    abstract String getCarName();

    abstract String getDistancePerLiter();

    abstract int getTripDistance();

    @Override
    public String toString() {
        return getCarName() + " : " + getDistancePerLiter() + "리터" + "\n";
    }
}
