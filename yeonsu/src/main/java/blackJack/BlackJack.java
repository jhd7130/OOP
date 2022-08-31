package blackJack;

import blackJack.domain.Deck;
import blackJack.domain.gamer.Dealer;
import blackJack.domain.gamer.Players;
import blackJack.util.ConsoleIn;
import blackJack.util.ConsoleOutMessage;
import blackJack.util.PlayerStringUtil;

public class BlackJack {

    public static void Init() {
        ConsoleOutMessage.GAME_START_MESSAGE.print();
        Deck deck = Deck.getInstance();
        Players players = Players.from(PlayerStringUtil.stringPlayersUsingRegex(ConsoleIn.UserInputNames()));// Setting Players
        Dealer dealer = Dealer.getInstance();
        PlayerStringUtil.GamersInfoPrint(dealer, players);
        players.playerGetMoreCards();
    }
}
