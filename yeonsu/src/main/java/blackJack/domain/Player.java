package blackJack.domain;

import blackJack.domain.wrapper.Money;
import blackJack.infra.ConsoleIn;
import blackJack.infra.ConsoleOut;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String playerName;
    private List<Card> cards;
    private Money money;

    private Player(String playerName) {
        this.playerName = playerName;
        cards = new ArrayList<>();
        money = new Money(0);
    }

    public static Player from(String playerName) {
        return new Player(playerName);
    }

    public List<Card> currentPlayerCards() {
        return cards;
    }

    public void playerBattingMoneyMessage() {
        System.out.println(this.playerName + ConsoleOut.PLAYER_BATTING_MESSAGE);
        playerBattingMoney(ConsoleIn.UserInputBattingMoney());
    }

    public void playerBattingMoney(int battingMoney) {
        money.batting(battingMoney);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        if (playerName != null ? !playerName.equals(player.playerName) : player.playerName != null) return false;
        return cards != null ? cards.equals(player.cards) : player.cards == null;
    }

    @Override
    public int hashCode() {
        int result = playerName != null ? playerName.hashCode() : 0;
        result = 31 * result + (cards != null ? cards.hashCode() : 0);
        return result;
    }

}
