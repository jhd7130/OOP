package blackJack.domain;

import blackJack.domain.gamer.Dealer;
import blackJack.domain.gamer.Player;
import blackJack.domain.gamer.Players;
import blackJack.util.ConsoleOut;

import java.util.List;

public class GameResult {

    public static void FinishGame(Dealer dealer, Players players) {
        List<Player> playerList = players.currentPlayers();
        if (isDealerOverBlackJack(dealer)) {
            dealerCardOverTheBlackJack(dealer, players);
        } // 딜러 카드의 합이 21을 넘었을 경우

        if (isDealerHasBlackJack(dealer)) {
            playerList.stream().forEach(player -> {
                if (player.currentScore() != ConsoleOut.BLACK_JACK_NUMBER) {
                    player.looseGame();
                }
            });
            calculateMoney(dealer, players);
        } // 딜러 카드가 블랙잭인 경우

        if (isDealerUnderBlackJack(dealer)) {
            playerList.stream().forEach(player -> {
                if (isPlayerOverBlackJack(player)) {
                    player.looseGame();
                }
                if (isPlayerUnderBlackJackAndBeatTheDealer(dealer, player)) {
                    player.winGame();
                }
                player.looseGame();
            });
            calculateMoney(dealer, players);
        } // 딜러 카드가 블랙잭 보다 작은 경우
    }

    private static boolean isPlayerUnderBlackJackAndBeatTheDealer(Dealer dealer, Player player) {
        return player.currentScore() <= ConsoleOut.BLACK_JACK_NUMBER && player.currentScore() > dealer.currentScore();
    }

    private static boolean isPlayerOverBlackJack(Player player) {
        return player.currentScore() > ConsoleOut.BLACK_JACK_NUMBER;
    }

    private static boolean isDealerUnderBlackJack(Dealer dealer) {
        return dealer.currentScore() < ConsoleOut.BLACK_JACK_NUMBER;
    }

    private static boolean isDealerHasBlackJack(Dealer dealer) {
        return dealer.currentScore() == ConsoleOut.BLACK_JACK_NUMBER;
    }

    private static void dealerCardOverTheBlackJack(Dealer dealer, Players players) {
        players.playersWinGame();
        calculateMoney(dealer, players);
    }

    private static void calculateMoney(Dealer dealer, Players players) {
        players.playersMoney();
        if (isDealerOverBlackJack(dealer)) {
            dealer.getTotalMoney((-1) * players.playersTotalMoneySum());
        }
        if (isDealerHasBlackJack(dealer) || isDealerUnderBlackJack(dealer)) {
            dealer.getTotalMoney(players.playersTotalMoneySum());
        }
    }

    private static boolean isDealerOverBlackJack(Dealer dealer) {
        return dealer.currentScore() > ConsoleOut.BLACK_JACK_NUMBER;
    }
}
