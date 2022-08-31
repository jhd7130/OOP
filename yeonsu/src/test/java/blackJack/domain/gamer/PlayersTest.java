package blackJack.domain.gamer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {


    @Test
    public void playerSettingTest() throws Exception {
        List<Player> players = new ArrayList<>();
        players.add(Player.from("Lee"));
        players.add(Player.from("Choi"));
        List<String> playersStringList = Arrays.asList("Lee", "Choi");

        assertThat(Players.from(playersStringList).currentPlayers()).isEqualTo(players);

    }

}