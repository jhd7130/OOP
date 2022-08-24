package positionCalculator.utils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringUtils {

    public static List<Integer> extractInteger(String str) {
        String replacedString = str.replaceAll("[^?0-9]+", " ");
        List<String> strings = Arrays.asList(replacedString.trim().split(" "));

        return strings.stream().map(x -> Integer.valueOf(x)).collect(Collectors.toList());
    }
}
