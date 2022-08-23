package fuelInjection.domain;

import java.text.DecimalFormat;

public class Avante extends Car {
    private int kilo;
    private final double annualFuel = 15;

    public Avante(int kilo) {
        this.kilo = kilo;
    }

    @Override
    public String getCarName() {
        return Avante.class.getName().substring(Avante.class.getPackageName().length()+1);
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
