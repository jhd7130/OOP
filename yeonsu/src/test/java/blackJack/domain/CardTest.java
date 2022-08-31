package blackJack.domain;

import blackJack.domain.wrapper.CardNumber;
import blackJack.domain.wrapper.Shape;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @DisplayName("Card 객체 생성 시 문제 없음을 테스트")
    @Test
    public void cardTest() throws Exception {
        assertThat(Card.of(Shape.HEART, CardNumber.K)).isEqualTo(Card.of(Shape.HEART, CardNumber.K));
    }

}