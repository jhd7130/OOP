package blackJack.domain.wrapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CardNumberTest {

    @Test
    public void cardNumberValidationTest() throws Exception {
        Assertions.assertThatCode(() -> new CardNumber("3")).doesNotThrowAnyException();
    }

    @Test
    public void cardNumberValidationExceptionTest() throws Exception {
        assertThatThrownBy(() -> new CardNumber("H"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}