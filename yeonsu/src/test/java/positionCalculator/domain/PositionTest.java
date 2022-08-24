package positionCalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    public void positionSameTest() throws Exception {
        Position position = Position.from(15, 20);
        assertThat(position).isEqualTo(Position.from(15, 20));
    }

}