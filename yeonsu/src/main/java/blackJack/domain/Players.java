package blackJack.domain;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Player> players;

    private Players(String playersName) {
        players = new ArrayList<>();
        settingPlayerIntoPlayerCollection(playersName);
    }

    public static Players from(String playersName) {
        return new Players(playersName);
    }

    public List<Player> currentPlayers() {
        return players;
    }

    public void playersBattingMessage() {
        players.stream().forEach(Player::playerBattingMoneyMessage);
    }

    public String playerNameMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int index = 0; index < players.size(); index++) {
            stringBuffer.append(players.get(index).currentName());
            if (index != players.size() - 1) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    private void settingPlayerIntoPlayerCollection(String playersStringName) {
        for (String player : sepPlayerName(playersStringName)) {
            players.add(Player.from(player));
        }
    }

    private String[] sepPlayerName(String playerName) {
        return playerName.split(",");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Players)) return false;

        Players players1 = (Players) o;

        return players != null ? players.equals(players1.players) : players1.players == null;
    }

    @Override
    public int hashCode() {
        return players != null ? players.hashCode() : 0;
    }
}
