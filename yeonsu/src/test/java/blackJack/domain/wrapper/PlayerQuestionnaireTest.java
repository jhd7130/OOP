package blackJack.domain.wrapper;

import blackJack.exception.PlayerHaveToInputAgainCharYOrN;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerQuestionnaireTest {

    @DisplayName("Failure Case")
    @ParameterizedTest
    @ValueSource(chars = {'A', 'K', 'J'})
    public void questionnaireFailTest(Character input) throws Exception {
        assertThat(PlayerQuestionnaire.isRightAnswer(input)).isFalse();
    }

    @DisplayName("Success Case")
    @ParameterizedTest
    @ValueSource(chars = {'Y', 'y', 'N', 'n'})
    public void questionnaireSuccessTest(Character input) throws Exception {
        assertThat(PlayerQuestionnaire.isRightAnswer(input)).isTrue();
    }


}