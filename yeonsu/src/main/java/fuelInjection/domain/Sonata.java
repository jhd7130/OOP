package fuelInjection.domain;

import java.text.DecimalFormat;

public class Sonata extends Car {
    private int kilo;
    private final double annualFuel = 10;

    Sonata(int kilo) {
        this.kilo = kilo;
    }

    @Override
    String getCarName() {
        return Sonata.class.getName().substring(Sonata.class.getPackageName().length()+1);
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
