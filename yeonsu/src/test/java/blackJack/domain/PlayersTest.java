package blackJack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class PlayersTest {

    @Test
    public void playersMemberTest() throws Exception {
        String givenStr = "pobi,jason";
        assertThat(Players.from(givenStr).currentPlayers()).isEqualTo(Arrays.stream(playersMember(givenStr)).map(player -> Player.from(player)).collect(Collectors.toList()));
    }

    private String[] playersMember(String givenStr) {
         return givenStr.split(",");
    }
}