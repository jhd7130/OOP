package carRacing.utils;

public class RandomGenerator implements Generator {

    @Override
    public int generateNumber() {
        return (int)(Math.random() * 10);
    }
}
