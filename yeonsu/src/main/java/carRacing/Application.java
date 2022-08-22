package carRacing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        String str = "abcd,efgh";
        String[] split = str.split(",");
        List<String> collect = Arrays.stream(split).collect(Collectors.toList());
        System.out.println(collect);
    }
}
