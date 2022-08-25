package positionCalculator;

import positionCalculator.domain.PlayResult;
import positionCalculator.domain.Pointers;
import positionCalculator.service.ConsoleIn;
import positionCalculator.service.ConsoleMessage;
import positionCalculator.service.StringCustomizing;

public class PointerCalculator {

    public static void init() {
        ConsoleMessage.GAME_START.print();
        Pointers pointers = Pointers.of(StringCustomizing.generate(ConsoleIn.userInputString()));
        PlayResult.play(pointers);
    }
}
