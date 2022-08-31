package blackJack.domain.gamer;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Player> players;

    public Players(List<String> playersStringList) {
        players = new ArrayList<>();
        for (String player : playersStringList) {
            players.add(Player.from(player));
        }
    }


    public static Players from(List<String> playersStringList) {
        return new Players(playersStringList);
    }

    public List<Player> currentPlayers() {
        return players;
    }
}
