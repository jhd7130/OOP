package carRacing.wrapper;

import carRacing.exception.CarNameOutOfRangeException;
import carRacing.utils.ConsoleOut;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {

    @DisplayName("Car Name Length is in range")
    @Test
    public void carNameLengthInRangeTest() throws Exception {
        assertThatCode(() -> new CarName("abcd")).doesNotThrowAnyException();
    }

    @DisplayName("Car Name Length is not in range")
    @Test
    public void carNameLengthOutOfRangeTest() throws Exception {
        assertThatThrownBy(() -> new CarName("abcdef"))
                .isInstanceOf(CarNameOutOfRangeException.class)
                .hasMessageContaining(ConsoleOut.CAR_NAME_EXCEPTION_MESSAGE);
    }
}