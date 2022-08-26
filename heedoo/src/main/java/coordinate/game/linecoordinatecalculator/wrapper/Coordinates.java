package coordinate.game.linecoordinatecalculator.wrapper;

import coordinate.game.linecoordinatecalculator.domain.Axis;
import coordinate.game.linecoordinatecalculator.domain.Coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Role : 좌표의 모음
 * Responsibility : string 좌표를 받으면 좌표를 각각 하나의 List로 가지고있는 자료구조의 형태
 * Cooperation with :
 **/
public class Coordinates {
    private final List<Coordinate> coordinates;
    private final Pattern pattern = Pattern.compile("/d+");

    private Coordinates(String stringCoordinates) {
        this.coordinates = makeCoordinates(stringCoordinates);
    }

    public static Coordinates init(String stringCoordinates) {
        return new Coordinates(stringCoordinates);
    }

    private List<Coordinate> makeCoordinates(String stringCoordinates) {

        List<Coordinate> realCoordinate = new ArrayList<>();
        List<String > copyCoordinate =  makeCopyCoordinate(stringCoordinates);

        for (String axix : copyCoordinate){
            List<Axis> axis = new ArrayList<>();

            Arrays.stream(axix.split(","))
                  .forEach(x-> axis.add(Axis.create(Integer.parseInt(x))));

            realCoordinate.add(Coordinate.create(axis.get(0),axis.get(1)));
        }

        return realCoordinate;
    }

    private List<String> makeCopyCoordinate(String stringCoordinates) {

        String[] splitCoordinate = stringCoordinates.split("-") ;

        return Arrays.stream(splitCoordinate)
                     .map(x -> x.substring(1,x.length() - 1))
                     .collect(Collectors.toList());
    }

    public List<Integer> makeCoordinateList(String stringCoordinates){
        return new ArrayList<>();
    }


    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}
