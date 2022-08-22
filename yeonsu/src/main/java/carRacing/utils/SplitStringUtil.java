package carRacing.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitStringUtil {

    public static List<String> changeString(String str) {
        return Arrays.stream(strToSplit(str)).collect(Collectors.toList());
    }

    private static String[] strToSplit(String str) {
        return str.split(",");
    }
}
