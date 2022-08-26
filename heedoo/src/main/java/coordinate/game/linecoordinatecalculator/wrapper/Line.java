package coordinate.game.linecoordinatecalculator.wrapper;

import coordinate.game.linecoordinatecalculator.domain.Coordinate;

import java.util.Objects;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class Line {
    private final Coordinate coordinate1;
    private final Coordinate coordinate;

    private Line(Coordinate coordinate, Coordinate coordinate1) {
        this.coordinate = coordinate;
        this.coordinate1 = coordinate1;
    }

    public static Line create(Coordinate coordinate, Coordinate coordinate1) {
        return new Line(coordinate,coordinate1);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return Objects.equals(coordinate1, line.coordinate1) && Objects.equals(coordinate, line.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate1, coordinate);
    }

    public double distance() {
        return coordinate.calculateDistance(coordinate1);
    }
}
