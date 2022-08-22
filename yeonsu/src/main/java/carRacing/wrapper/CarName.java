package carRacing.wrapper;

import carRacing.exception.CarNameOutOfRangeException;
import carRacing.utils.ConsoleOut;

public class CarName {
    private String name;

    public CarName(String name) {
        if (name.length() > 5) {
            throw new CarNameOutOfRangeException(ConsoleOut.CAR_NAME_EXCEPTION_MESSAGE);
        }
        this.name = name;
    }
    
}
