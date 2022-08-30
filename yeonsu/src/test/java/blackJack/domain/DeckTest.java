package blackJack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    public void amountOfCardsTest() throws Exception {
        Deck deck = Deck.getInstance();
        Assertions.assertThat(deck.currentDeck().size()).isEqualTo(52);
    }

}