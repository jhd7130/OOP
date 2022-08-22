package carRacing.domain;

import carRacing.utils.Generator;
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
        Generator generator = () -> 4;
        car.canMove(generator);
        assertThat(car.currentPosition()).isEqualTo(1);
    }

    @Test
    public void carPositionDoesNotMovingTest() throws Exception {
        Car car = Car.of("hello");
        Generator generator = () -> 3;
        car.canMove(generator);
        assertThat(car.currentPosition()).isEqualTo(0);
    }

}