package lambdaPractice.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class OptionalTest {

    
    @DisplayName("Empty Optional Object isPresent Test")
    @Test
    public void optionalIsPresentFalseTest() throws Exception {
        Optional<String> empty = Optional.empty();
        assertThat(empty.isPresent()).isFalse();
    }

    @Test
    public void optionalWhenItHasDataTest() throws Exception {
        String name = "LEE";
        Optional<String> optedName = Optional.of(name);
        assertThat(optedName.isPresent()).isTrue();
    }

    @Test
    public void optionalWhenItDoesNotHaveAnyData() throws Exception {
        assertThatThrownBy(() -> Optional.of(null).isPresent())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void optionalOrElseTest() throws Exception {
        String nullString = null;
        String su = Optional.ofNullable(nullString).orElse("SU");
        assertThat(su).isEqualTo("SU");
    }

    @Test
    public void optionalObjectNullableTest() throws Exception {
        User user = new User("park");
        User user1 = Optional.ofNullable(user).orElseGet(User::new);
        assertThat(user1).isEqualTo(new User("park"));
    }

    class User {
        private String name = "choi";

        public User() {
        }

        public User(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;

            User user = (User) o;

            return name != null ? name.equals(user.name) : user.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }
}
