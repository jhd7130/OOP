package blackJack.domain.gamer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void playerCreateTest() throws Exception {
        assertThat(Player.from("Lee")).isEqualTo(Player.from("Lee"));
    }

}