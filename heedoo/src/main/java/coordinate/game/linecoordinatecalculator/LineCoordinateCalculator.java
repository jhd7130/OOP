package coordinate.game.linecoordinatecalculator;

import coordinate.CoordinateCalculator;
import coordinate.game.linecoordinatecalculator.wrapper.Coordinates;
import coordinate.game.linecoordinatecalculator.wrapper.Line;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/

public class LineCoordinateCalculator implements CoordinateCalculator {
    @Override
    public void print(String coordinate) {
        //(10,10)-(14,15)
        Coordinates coordinates = Coordinates.init(coordinate);

        double line = Line.create(coordinates.getCoordinates().get(0),coordinates.getCoordinates().get(1))
            .distance();

        System.out.println("두점 사이의 거리는 : " + line);
    }

}
