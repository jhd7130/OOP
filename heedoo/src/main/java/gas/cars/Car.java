package gas.cars;

/**
 * Role : 자동차 한대
 * Responsibility : 연비를 통해 거리가 인자값(거리)에따라 몇리터의 기름이 주입되야하는지 체크)
 * Cooperation with :
 **/
public abstract class Car {

    public abstract int getTripDistance();

    public abstract int getFuelEfficiencyPerLiter();
    public String getName() {
        return this.getClass().getName().substring(this.getClass().getName().lastIndexOf('.') + 1) ;
    };


    public int gasNeed(){
        return getTripDistance()/getFuelEfficiencyPerLiter();
    };


}
