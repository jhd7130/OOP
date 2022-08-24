package coordinate.game.linecoordinatecalculator.domain;

import java.util.Objects;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class Axis {

    private final int axis;

    private Axis(int axis) {

        this.axis = axis;
    }
    public static Axis create(int axis) throws IllegalArgumentException{
        isFit(axis);
        return new Axis(axis);
    }

    private static void isFit(int axis) {
        if( axis > 24 ) throw new IllegalArgumentException("좌표 범위 초과");
        if (axis < 0) throw new IllegalArgumentException("0보다 큰 자연수 입력");
    }

    public boolean matchCoordinate(Axis axis) {
        return axis.equals(this);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Axis)) return false;
        Axis that = (Axis) o;
        return axis == that.axis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(axis);
    }

    public int diff(Axis axis) {
        return this.axis  - axis.axis;
    }
}
