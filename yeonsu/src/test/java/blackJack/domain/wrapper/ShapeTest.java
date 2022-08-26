package blackJack.domain.wrapper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeTest {

    @Test
    public void amountOfCardTest() throws Exception {
        List<String> collect = Arrays.stream(Shape.values()).map(x -> x.currentShape()).collect(Collectors.toList());
        assertThat(collect).contains(Shape.CLOVER.currentShape());
        assertThat(collect).doesNotContain("BLUE");
    }

}