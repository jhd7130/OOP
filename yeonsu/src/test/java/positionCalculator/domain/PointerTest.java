package positionCalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointerTest {

    @Test
    public void pointerCreateTest() throws Exception {
        Pointer pointer = new Pointer(3, 4);
        Assertions.assertThat(pointer).isEqualTo(new Pointer(3, 4));
    }


}