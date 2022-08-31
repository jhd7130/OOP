package blackJack.domain.gamer;

import blackJack.domain.Card;
import blackJack.domain.Deck;
import blackJack.util.CalculateCardScore;

import java.util.ArrayList;
import java.util.List;

public class Player implements Gamer {


    private String playerName;
    private List<Card> playerCards;

    private Player(String playerName) {
        this.playerName = playerName;
        playerCards = new ArrayList<>();
    }

    public static Player from(String playerName) {
        return new Player(playerName);
    }

    public void getCard() {
        playerCards.add(Deck.giveCard());
    }

    @Override
    public String currentName() {
        return playerName;
    }

    @Override
    public List<Card> currentCard() {
        return playerCards;
    }

    @Override
    public int currentScore() {
        return CalculateCardScore.cardScore(playerCards);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        return playerName != null ? playerName.equals(player.playerName) : player.playerName == null;
    }

    @Override
    public int hashCode() {
        return playerName != null ? playerName.hashCode() : 0;
    }
}
