package lambdaPractice.domain;

import java.util.Optional;

public class User {
    private int age = 0;

    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    public boolean ageInRange1() {
        if (age >= 30 && age <= 45) {
            return true;
        }
        return false;
    }

    public static boolean ageInRange2(User inputUser) {
        Optional<User> user = Optional.ofNullable(inputUser);
        return user.filter(x -> (x.age <= 45 && x.age >= 30)).isPresent();
    }
}
