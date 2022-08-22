package carRacing.domain;


import carRacing.wrapper.CarName;

/*
* Role : 게임에 참가할 자동차 객체
* Responsibility : 이름과 위치 값을 갖고 있으며 게임에 참가
* Collaboration :
*/
public class Car {

    private CarName carName;
    private int position;

    private Car(String carName) {
        this.carName = new CarName(carName);
        this.position = 0;
    }

    public static Car of(String carName) {
        return new Car(carName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return carName != null ? carName.equals(car.carName) : car.carName == null;
    }

    @Override
    public int hashCode() {
        return carName != null ? carName.hashCode() : 0;
    }

    public int currentPosition() {
        return position;
    }

    public void canMove(int randomValue) {
        if (randomValue >= 4) {
            position++;
        }
    }
}
