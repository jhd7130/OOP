package gas.cars;

/**
 * Role : 렌트카에 있는 차량
 * Responsibility :
 * Cooperation with :
 **/
public class Sonata extends Car {

    private int fuelEfficiency = 10;
    private int reservationDistinct;
    public Sonata(int distinct) {
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
