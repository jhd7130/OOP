package blackJack.domain.gamer;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Player> players;

    public Players(List<String> playersStringList) {
        players = new ArrayList<>();
        settingPlayers(playersStringList);
    }

    private void settingPlayers(List<String> playersStringList) {
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

    public void printPlayersCard() {
        players.stream().forEach(player -> player.printCards());
    }

    public void playerGetMoreCards() {
        players.stream().forEach(player -> player.getMoreCardOrNot());
    }
}
