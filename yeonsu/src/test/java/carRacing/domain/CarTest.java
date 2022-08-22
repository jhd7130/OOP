package carRacing.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void carSettingTest() throws Exception {
        assertThatCode(() -> Car.of("hello")).doesNotThrowAnyException();
    }

    @Test
    public void carInitPositionTest() throws Exception {
        assertThat(Car.of("Hello").currentPosition()).isEqualTo(0);
    }

    @Test
    public void carPositionMovingTest() throws Exception {
        Car car = Car.of("hello");
        car.canMove(4);
        assertThat(car.currentPosition()).isEqualTo(1);
    }

}