package positionCalculator.domain;

import positionCalculator.exception.ImPossiblePointerSizeException;
import positionCalculator.exception.SamePointerException;
import positionCalculator.service.ConsoleOut;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pointers {

    private List<Pointer> pointers;

    private Pointers(List<Integer> pointers) {
        this.pointers = new ArrayList<>();
        settingPointers(pointers);
        if (isNotSamePointer()) {
            throw new SamePointerException(ConsoleOut.POSITION_SAME_POINTER_EXCEPTION_MESSAGE);
        }
        if (this.pointers.size() < 2 || this.pointers.size() > 4) {
            throw new ImPossiblePointerSizeException(ConsoleOut.POSITION_SIZE_EXCEPTION_MESSAGE);
        }
    }

    List<Pointer> currentPointers() {
        return pointers;
    }

    private boolean isNotSamePointer() {
        return this.pointers.size() != this.pointers.stream().distinct().collect(Collectors.toList()).size();
    }

    public static Pointers of(List<Integer> numbers) {
        return new Pointers(numbers);
    }

    private void settingPointers(List<Integer> pointers) {
        for (int i = 0; i < pointers.size() / 2; i++) {
            this.pointers.add(createPointer(pointers.get(2 * i), pointers.get(2 * i + 1)));
        }
    }

    private static Pointer createPointer(int xPos, int yPos) {
        return new Pointer(xPos, yPos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pointers)) return false;

        Pointers pointers1 = (Pointers) o;

        return pointers != null ? pointers.equals(pointers1.pointers) : pointers1.pointers == null;
    }

    @Override
    public int hashCode() {
        return pointers != null ? pointers.hashCode() : 0;
    }
}
