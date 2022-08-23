package fuelInjection.domain;

import java.text.DecimalFormat;

public class K5 extends Car {
    private int kilo;
    private final double annualFuel = 13;

    public K5(int kilo) {
        this.kilo = kilo;
    }

    @Override
    String getCarName() {
        return K5.class.getName().substring(K5.class.getPackageName().length()+1);
    }

    @Override
    String getDistancePerLiter() {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        return decimalFormat.format(kilo / annualFuel);
    }

    @Override
    int getTripDistance() {
        return kilo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
