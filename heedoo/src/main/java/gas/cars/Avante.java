package gas.cars;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class Avante extends Car {

    private int fuelEfficiency = 15;
    private int reservationDistinct;

    public Avante(int distinct) {
        reservationDistinct = distinct;
    }
    @Override
    public int getTripDistance() {
        return this.reservationDistinct;
    }

    @Override
    public int getFuelEfficiencyPerLiter() {
        return this.fuelEfficiency;
    }

}
