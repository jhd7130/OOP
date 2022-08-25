package positionCalculator.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCustomizing {

    private static Pattern pattern = Pattern.compile("\\d+");

    // input data likes (10,20)-(30,40)
    public static List<Integer> generate(String userInput) {
        List<String> collect = pattern.matcher(userInput).results().map(MatchResult::group).collect(Collectors.toList());
        return collect.stream().mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
    }
}
