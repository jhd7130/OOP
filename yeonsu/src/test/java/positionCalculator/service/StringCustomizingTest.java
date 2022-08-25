package positionCalculator.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCustomizingTest {

    @ParameterizedTest
    @ValueSource(strings = "(10,10)-(14,15)")
    public void userInputStringToListIntegerTest(String input) throws Exception {
        List<Integer> integerList = Arrays.asList(10, 10, 14, 15);
        assertThat(StringCustomizing.generate(input)).isEqualTo(integerList);
    }
}