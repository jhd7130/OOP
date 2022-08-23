package fuelInjectionUsingInterface.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DoubleToStringTest {

    @Test
    public void typeChangeTest() throws Exception {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        double givenNumber = 3.14;
        assertThat(DoubleToString.changeType(givenNumber)).isEqualTo("3");
    }

}