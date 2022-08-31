package blackJack.util;

import blackJack.domain.Card;
import blackJack.domain.wrapper.CardNumber;
import blackJack.domain.wrapper.Shape;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculateCardScoreTest {

    @DisplayName("Single Card Case")
    @Test
    public void calculateCardResultTest() throws Exception {
        Card card = Card.of(Shape.SPADE, CardNumber.A);
        List<Card> cards = Arrays.asList(card);
        assertThat(CalculateCardScore.cardScore(cards)).isEqualTo(CardNumber.A.getCardNumber());
    }

    @DisplayName("J,Q,K Cards case")
    @Test
    public void calculateCardJQKTypeTest() throws Exception {
        Card cardJ = Card.of(Shape.SPADE, CardNumber.J);
        Card cardQ = Card.of(Shape.SPADE, CardNumber.Q);
        Card cardK = Card.of(Shape.SPADE, CardNumber.K);

        List<Card> cards = Arrays.asList(cardJ, cardK, cardQ);
        assertThat(CalculateCardScore.cardScore(cards)).isEqualTo(30);
    }

    @DisplayName("BlackJack 숫자가 넘었을 경우 A card Type Check")
    @Test
    public void overBlackJackNumberIncludeCardNumberATest() throws Exception {
        Card cardA = Card.of(Shape.SPADE, CardNumber.A);
        Card cardQ = Card.of(Shape.SPADE, CardNumber.Q);
        Card cardK = Card.of(Shape.SPADE, CardNumber.K);

        List<Card> cards = Arrays.asList(cardA, cardK, cardQ);
        assertThat(CalculateCardScore.cardScore(cards)).isEqualTo(21);
    }

}