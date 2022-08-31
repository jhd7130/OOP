package blackJack.util;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PlayerStringUtil {

    private static String regex = "[a-zA-Z]+";

    public static List<String> stringPlayersUsingRegex(String userInput) {
        List<String> collect = Pattern.compile(regex).matcher(userInput).results().map(MatchResult::group).collect(Collectors.toList());
        System.out.println(collect);
        return collect;
    }

    public String[] stringsPlayer(String userInput) {
        return userInput.split(",");
    }
}
