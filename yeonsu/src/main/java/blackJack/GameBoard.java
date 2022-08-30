package blackJack;

import blackJack.domain.Dealer;
import blackJack.domain.Deck;
import blackJack.domain.Players;
import blackJack.infra.ConsoleIn;
import blackJack.infra.ConsoleOutMessage;

public class GameBoard {

    public static void init() {
        ConsoleOutMessage.GAME_INIT_MESSAGE.print();
        Deck init = Deck.init(); // deck suffle
        Players players = Players.from(ConsoleIn.PlayerInput());
        players.playersBattingMessage();
        Dealer.of(init, players);
    }
}
