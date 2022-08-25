package lambdaPractice.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void userAgeRangeTest() throws Exception {
        User user = new User(35);
        assertThat(user.ageInRange1()).isTrue();
    }

    @Test
    public void userAgeRangeUsingOptionalTest() throws Exception {
        assertThat(User.ageInRange2(new User(55))).isFalse();
    }

}