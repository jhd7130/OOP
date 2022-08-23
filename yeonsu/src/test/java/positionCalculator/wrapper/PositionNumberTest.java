package positionCalculator.wrapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import positionCalculator.exception.PositionNumberException;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class PositionNumberTest {

    @Test
    public void positionNumberValidTest() throws Exception {
        assertThatCode(() -> new PositionNumber(5)).doesNotThrowAnyException();
    }

    @Test
    public void positionExceptionTest() throws Exception {
        Assertions.assertThatThrownBy(() -> new PositionNumber(25))
                .isInstanceOf(PositionNumberException.class);
    }

}