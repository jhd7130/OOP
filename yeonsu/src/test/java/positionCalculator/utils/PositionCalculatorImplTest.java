package positionCalculator.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import positionCalculator.domain.Position;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class PositionCalculatorImplTest {

    @Test
    public void distanceCalculationTest() throws Exception {
        PositionCalculator calculator = new PositionCalculatorImpl();
        //given
        Position position1 = Position.from(1, 1);
        Position position2 = Position.from(4, 5);

        //when
        DecimalFormat decimalFormat = new DecimalFormat("#");

        double calculate = calculator.calculate(position1, position2);

        //then
        Assertions.assertThat(decimalFormat.format(calculate)).isEqualTo("5");
    }

}