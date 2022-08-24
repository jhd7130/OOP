package positionCalculator.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import positionCalculator.domain.Position;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

class PositionCalculatorImplTest {

    @Test
    public void distanceCalculationTest() throws Exception {
        PositionCalculator calculator = new PositionCalculatorTwoPositions();
        //given
        Position position1 = Position.from(1, 1);
        Position position2 = Position.from(4, 5);

        List<Position> positions = Arrays.asList(position1, position2);
        //when
        DecimalFormat decimalFormat = new DecimalFormat("#");

        double calculate = calculator.calculate(positions);

        //then
        Assertions.assertThat(decimalFormat.format(calculate)).isEqualTo("5");
    }

}