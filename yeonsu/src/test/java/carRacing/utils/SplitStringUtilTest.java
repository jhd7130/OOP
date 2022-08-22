package carRacing.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SplitStringUtilTest {

    @Test
    public void stringSplitTest() throws Exception {
        String str = "abc,efd";
        String[] split = str.split(",");
        List<String> strings = new ArrayList<>();
        for (String eachString : split) {
            strings.add(eachString);
        }
        assertThat(SplitStringUtil.changeString(str)).isEqualTo(strings);
    }

}