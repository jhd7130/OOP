package positionCalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import positionCalculator.exception.ImPossiblePointerSizeException;
import positionCalculator.exception.SamePointerException;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PointersTest {

    @Test
    public void positionsSameCaseTest() throws Exception {
        List<Integer> integerList = Arrays.asList(1, 2);
        Pointers pointers1 = Pointers.of(integerList);
        Pointers pointers2 = Pointers.of(integerList);

        assertThat(pointers1).isEqualTo(pointers2);
    }

    @Test
    public void positionsCreateTest() throws Exception {
        List<Integer> integerList = Arrays.asList(1, 2);
        assertThatCode(() -> Pointers.of(integerList)).doesNotThrowAnyException();
    }

    @Test
    public void samePointerExceptionTest() throws Exception {
        List<Integer> integerList = Arrays.asList(1, 2, 1, 2);
        assertThatThrownBy(() -> Pointers.of(integerList))
                .isInstanceOf(SamePointerException.class);
    }

    @Test
    public void pointerSizeExceptionTest() throws Exception {
        List<Integer> integerList = Arrays.asList(1, 2);
        assertThatThrownBy(() -> Pointers.of(integerList))
                .isInstanceOf(ImPossiblePointerSizeException.class);
    }
}