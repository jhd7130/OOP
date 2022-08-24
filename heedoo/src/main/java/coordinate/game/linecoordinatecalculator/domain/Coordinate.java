package coordinate.game.linecoordinatecalculator.domain;

import java.util.Objects;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class Coordinate {
    private final Axis x;
    private final Axis y;

    private Coordinate(Axis x, Axis y){
        this.x = x;
        this.y = y;
    }
    public static Coordinate create(Axis x, Axis y) {
        return new Coordinate(x,y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        Coordinate that = (Coordinate) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double calculateDistance(Coordinate coordinate1) {
        double sum = Math.pow(this.x.diff(coordinate1.x),2) + Math.pow(this.y.diff(coordinate1.y),2);
        return Math.sqrt(sum);
    }
}
