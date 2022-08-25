package positionCalculator.domain;

import positionCalculator.service.factory.CalculatorFactory;
import positionCalculator.service.factory.PointersCalculator;

import java.util.List;

public class PlayResult {

    public static void play(Pointers givenPointers) {
        PointersCalculator pointersCalculator = CalculatorFactory.calculatorComponent(givenPointers.currentPointers().size());
        pointersCalculator.calculateExpression(givenPointers);
    }
}
