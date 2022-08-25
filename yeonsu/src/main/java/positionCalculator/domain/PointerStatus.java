package positionCalculator.domain;

public enum PointerStatus {
    TWO(2),THREE(3),FOUR(4);

    private int amountOfPointers;

    PointerStatus(int amountOfPointers) {
        this.amountOfPointers = amountOfPointers;
    }


    public boolean isTwo(int number) {
        return TWO.amountOfPointers == number;
    }

    public boolean isThree(int number) {
        return THREE.amountOfPointers == number;
    }

    public boolean isFour(int number) {
        return FOUR.amountOfPointers == number;
    }
}
