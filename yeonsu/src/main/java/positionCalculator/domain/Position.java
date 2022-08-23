package positionCalculator.domain;

import positionCalculator.wrapper.PositionNumber;

public class Position {
    private PositionNumber xPos;
    private PositionNumber yPos;

    private Position(int xPos, int yPos) {
        this.xPos = new PositionNumber(xPos);
        this.yPos = new PositionNumber(yPos);
    }

    public static Position from(int xPos, int yPos) {
        return new Position(xPos, yPos);
    }

    public int currentXPos() {
        return xPos.currentNumber();
    }

    public int currentYPos() {
        return yPos.currentNumber();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (xPos != null ? !xPos.equals(position.xPos) : position.xPos != null) return false;
        return yPos != null ? yPos.equals(position.yPos) : position.yPos == null;
    }

    @Override
    public int hashCode() {
        int result = xPos != null ? xPos.hashCode() : 0;
        result = 31 * result + (yPos != null ? yPos.hashCode() : 0);
        return result;
    }
}
