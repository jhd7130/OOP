package carRacing.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PositionToDashStringTest {


    @Test
    public void PositionToStringDashStringTest() throws Exception {
        int times = 5;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < times; i++) {
            stringBuffer.append("-");
        }
        assertThat(PositionToDashString.resultDash(times)).isEqualTo("-----");
    }


}