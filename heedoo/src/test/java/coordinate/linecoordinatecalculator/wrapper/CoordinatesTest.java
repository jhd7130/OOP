package coordinate.linecoordinatecalculator.wrapper;

import coordinate.game.linecoordinatecalculator.domain.Axis;
import coordinate.game.linecoordinatecalculator.domain.Coordinate;
import coordinate.game.linecoordinatecalculator.wrapper.Coordinates;
import coordinate.game.linecoordinatecalculator.wrapper.Line;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CoordinatesTest {

    @Test
    void test(){
    // given
        String line = "(10,10)-(14,15)";
        Coordinates coordinates = Coordinates.init(line);

        Assertions.assertThat(coordinates.getCoordinates().get(0)).isEqualTo(Coordinate.create(Axis.create(10),Axis.create(10)));
        Assertions.assertThat(coordinates.getCoordinates().get(1)).isEqualTo(Coordinate.create(Axis.create(14),Axis.create(15)));

    }

}
