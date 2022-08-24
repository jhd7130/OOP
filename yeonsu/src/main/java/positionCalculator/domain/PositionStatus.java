package positionCalculator.domain;

public enum PositionStatus {
    TWO(2), THREE(3), FOUR(4);

    private int number;

    PositionStatus(int number) {
        this.number = number;
    }

    public static boolean isTwo(int size) {
        return TWO.number == size;
    }

    public static boolean isThree(int size) {
        return THREE.number == size;
    }

    public static boolean isFour(int size) {
        return THREE.number == size;
    }
}
