package coordinate.global;

import coordinate.CoordinateCalculator;
import coordinate.game.linecoordinatecalculator.LineCoordinateCalculator;
import coordinate.game.squarecoordinatecalculator.SquareCoordinateCalculator;
import coordinate.game.trianglecoordinatecalculator.TriangleCoordinateCalculator;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CorrdinateCalculatorFactory {

    public static CoordinateCalculator create(CalculatorType calculatorType){

        switch (calculatorType){
            case LINE:
                return new LineCoordinateCalculator();
            case SQUARE:
                return new SquareCoordinateCalculator();
            case TRIANGLE:

                return new TriangleCoordinateCalculator();
        }

        throw new IllegalStateException("적합한 유형의 계산기가 존재하지 않습니다.");
    }

}
