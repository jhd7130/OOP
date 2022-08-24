package coordinate.linecoordinatecalculator.wrapper;

import coordinate.game.linecoordinatecalculator.domain.Axis;
import coordinate.game.linecoordinatecalculator.domain.Coordinate;
import coordinate.game.linecoordinatecalculator.wrapper.Line;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class LineTest {

    public Line line;

    @BeforeEach
    void make_test_case() {
        line = Line.create(Coordinate.create(Axis.create(4),Axis.create(5)), Coordinate.create(Axis.create(7),Axis.create(5)));
    }

    @Test
    @DisplayName("직선 wrapper 테스트")
    void 두좌표_직선_생성(){
        assertThat(line).isEqualTo(Line.create(Coordinate.create(Axis.create(4),Axis.create(5)), Coordinate.create(Axis.create(7),Axis.create(5))));
    }

    @Test
    void 거리_계산_테스트(){
    // given : 인스턴스 메서드로 생성됨 line
    // when
    // then
        assertEquals(3.0, line.distance(), 0.001);
    }

}
