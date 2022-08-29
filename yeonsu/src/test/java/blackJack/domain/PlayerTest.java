package blackJack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void playerInitTest() throws Exception {
        Player player = Player.from("pobi");
        assertThat(player).isEqualTo(Player.from("pobi"));
    }


    @Test
    public void playerInitCardsSizeTest() throws Exception {
        assertThat(Player.from("pobi").currentPlayerCards().size()).isEqualTo(0);
    }
}