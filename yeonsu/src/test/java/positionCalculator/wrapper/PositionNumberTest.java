package positionCalculator.wrapper;

import org.junit.jupiter.api.Test;
import positionCalculator.exception.PositionOutOfRangeException;
import positionCalculator.service.ConsoleOut;

import static org.assertj.core.api.Assertions.*;

class PositionNumberTest {

    @Test
    public void samePositionNumberTest() throws Exception {
        PositionNumber positionNumber = new PositionNumber(4);
        assertThat(positionNumber).isEqualTo(new PositionNumber(4));
    }

    @Test
    public void positionInRangeTest() throws Exception {
        assertThatCode(() -> new PositionNumber(5))
                .doesNotThrowAnyException();
    }

    @Test
    public void positionOutOfRangeTest() throws Exception {
        assertThatThrownBy(() -> new PositionNumber(25))
                .isInstanceOf(PositionOutOfRangeException.class)
                .hasMessageContaining(ConsoleOut.POSITION_OUT_OF_RANGE_EXCEPTION_MESSAGE);
    }

}