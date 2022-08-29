package blackJack.domain.wrapper;

import blackJack.infra.exception.MoneyOutOfBounds;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @DisplayName("돈은 음수 값을 가질 수 없습니다.")
    @Test
    public void moneyCapacityTest() throws Exception {
        assertThatThrownBy(() -> new Money(-1)).isInstanceOf(MoneyOutOfBounds.class);
    }

}