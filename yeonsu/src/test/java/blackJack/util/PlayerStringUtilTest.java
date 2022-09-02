package blackJack.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class PlayerStringUtilTest {

    @Test
    public void regexResultTest() throws Exception {
        String userInput = "pobi,jason";

        Assertions.assertThat(GamerStringUtil.stringPlayersUsingRegex(userInput)).isEqualTo(stringToList(userInput));
    }

    private List<String> stringToList(String str) {
        return Arrays.stream(str.split(",")).collect(Collectors.toList());
    }
}