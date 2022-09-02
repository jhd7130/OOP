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

    public void printPlayersCardIncludeResult() {
        players.stream().forEach(player -> player.printCardsIncludeResult());
    }

    public void playersWinGame() {
        players.stream().forEach(player -> player.winGame());
    }

    public void playersLooseGame() {
        players.stream().forEach(player -> player.looseGame());
    }

    public void playersMoney() {
        players.stream().forEach(player -> player.printMoney());
    }

    public int playersTotalMoneySum() {
        return players.stream().mapToInt(player -> player.currentMoney()).sum();
    }
}
