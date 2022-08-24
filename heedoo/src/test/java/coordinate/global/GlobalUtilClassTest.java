package coordinate.global;

import coordinate.CoordinateCalculator;
import coordinate.game.linecoordinatecalculator.LineCoordinateCalculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/

public class GlobalUtilClassTest {

    @Test
    void 타입_팩토리_테스트(){
    // given
        CoordinateCalculator coordinateCalculator = CorrdinateCalculatorFactory.create(CalculatorType.LINE);
    // when then
        Assertions.assertThat(coordinateCalculator instanceof LineCoordinateCalculator).isTrue();
    }

}
