package positionCalculator.domain;

import positionCalculator.wrapper.PositionNumber;

public class Pointer {
    private PositionNumber xPox;
    private PositionNumber yPos;

    Pointer(int xPox, int yPos) {
        this.xPox = new PositionNumber(xPox);
        this.yPos = new PositionNumber(yPos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pointer)) return false;

        Pointer pointer = (Pointer) o;

        if (xPox != null ? !xPox.equals(pointer.xPox) : pointer.xPox != null) return false;
        return yPos != null ? yPos.equals(pointer.yPos) : pointer.yPos == null;
    }

    @Override
    public int hashCode() {
        int result = xPox != null ? xPox.hashCode() : 0;
        result = 31 * result + (yPos != null ? yPos.hashCode() : 0);
        return result;
    }
}
