package positionCalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import positionCalculator.exception.PositionDuplicationException;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositionsTest {


    @DisplayName("중복된 두 개의 위치 값이 주어지면 예외 발생")
    @Test
    public void positionDuplicationExceptionTest() throws Exception {
        //given
        Position position1 = Position.from(10, 10);
        Position position2 = Position.from(10, 10);

        //when
        List<Position> positions = Arrays.asList(position1, position2);

        //then
        Assertions.assertThatThrownBy(() -> new Positions(positions))
                .isInstanceOf(PositionDuplicationException.class)
                .hasMessage("중복된 값이 존재합니다.");
    }

}