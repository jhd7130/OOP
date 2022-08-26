package coordinate.global;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class PatternTest {
    @Test
    void patternTest(){
        Pattern pattern = Pattern.compile("\\d+");
        pattern.matcher("(10,10)-(14,15)")
                .results()
                .map(x-> Integer.parseInt(x.group()))
                .collect(Collectors.toList());

    }

}
