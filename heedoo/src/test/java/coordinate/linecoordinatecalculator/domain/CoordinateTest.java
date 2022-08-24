package coordinate.linecoordinatecalculator.domain;

import coordinate.game.linecoordinatecalculator.domain.Axis;
import coordinate.game.linecoordinatecalculator.domain.Coordinate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Role :
 * Responsibility :
 * Cooperation with :
 **/
public class CoordinateTest {

    // 좌표 생성 테스트 xy 상관없음
    @Test
    @DisplayName("x좌표 생성 테스트")
    void x축(){
        Axis xAxis = Axis.create(3);
        assertThat(xAxis.matchCoordinate(Axis.create(3))).isTrue();
    }

    @Test
    @DisplayName("x좌표 생성 테스트")
    void x축_범위(){
        // 예외 메세지를 추출해보고 싶다 어떻게 해야할까?
        assertThrows(IllegalArgumentException.class,
                                            ()-> Axis.create(25));
    }

    @Test
    @DisplayName("좌표 집합 생성 테스트")
    void 좌표_집합_테스트() {
        // given
        Axis x = Axis.create(3), y = Axis.create(4);
        Coordinate coordinate = Coordinate.create(x,y);

        // when  then
        assertThat(coordinate).isEqualTo(Coordinate.create(Axis.create(3),Axis.create(4)));

    }

    @Test
    @DisplayName("두점사이의 직선")
    void 직선_생성_테스트() {
        // 1. Line factory
    }


}
