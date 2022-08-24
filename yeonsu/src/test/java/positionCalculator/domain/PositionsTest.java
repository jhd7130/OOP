package positionCalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import positionCalculator.exception.AmountOfPointersException;
import positionCalculator.exception.PositionDuplicationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PositionsTest {

    @ParameterizedTest
    @ValueSource(ints = {1,5})
    public void amountOfPointerJudgementExceptionTest(int input) throws Exception {
        List<Integer> integerList = IntStream.of(new int[input]).boxed().collect(Collectors.toList());
        assertThatThrownBy(() -> new Positions(integerList))
                .isInstanceOf(AmountOfPointersException.class);
    }

    @Test
    public void positionDuplicationExceptionIntegerListTest() throws Exception {
        List<Integer> list = Arrays.asList(10, 10, 10, 10);
        assertThatThrownBy(() -> new Positions(list))
                .isInstanceOf(PositionDuplicationException.class);
    }

}