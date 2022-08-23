package gas.cars;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class K5 extends Car {

    private int fuelEfficiency = 13;
    private int reservationDistinct;

    public K5(int reservationDistinct) {
        this.reservationDistinct = reservationDistinct;
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
