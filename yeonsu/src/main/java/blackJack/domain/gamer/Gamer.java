package blackJack.domain.gamer;

import blackJack.domain.Card;

public interface Gamer {

    String currentName();

    Card currentCard();

    int currentScore();
}
