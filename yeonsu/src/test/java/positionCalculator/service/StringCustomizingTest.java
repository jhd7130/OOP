package positionCalculator.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCustomizingTest {

    @ParameterizedTest
    @ValueSource(strings = {"(10,10)-(14,15)", "(10,10)-(22,10)-(22,18)-(10,18)"})
    public void userInputStringToListIntegerTest(String input) throws Exception {
        assertThat(StringCustomizing.generate(input)).isEqualTo(stringToList(input));
    }

    private List<Integer> stringToList(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        List<String> collect = pattern.matcher(input).results().map(MatchResult::group).collect(Collectors.toList());
        return collect.stream().mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
    }
}