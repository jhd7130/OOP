package fuelInjectionUsingInterface.wrapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {

    @Test
    public void carNameValidation() throws Exception {
        assertThatCode(() -> new CarName("Hello")).doesNotThrowAnyException();
    }

    @Test
    public void carNameExceptionTest() throws Exception {
        assertThatThrownBy(() -> new CarName("HelloWorld")).isInstanceOf(IllegalArgumentException.class);
    }


}