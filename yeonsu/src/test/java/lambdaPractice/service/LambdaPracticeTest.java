package lambdaPractice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LambdaPracticeTest {

    List<Integer> integerList = null;

    @BeforeEach
    void setUp() {
        integerList = Arrays.asList(1, 2, 2, 3, 4, 5, 6);
    }


    @Test
    public void removeDuplicationDataInArrayUsingLambdaTest() throws Exception {
        List<Integer> collect = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void filterDataBiggerThanThreeUsingLambdaTest() throws Exception {
        List<Integer> collect = integerList.stream().filter(x -> x > 3).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }

    @DisplayName("List에 담긴 모든 숫자 중 3보다 큰 숫자를 2배 한 후 모든 값의 합을 구한다.")
    @Test
    public void lambdaPracticeTest() throws Exception {
        Integer reduce = integerList.stream().filter(x -> x > 3).map(x -> 2 * x).reduce(0, Integer::sum);
        System.out.println("answer = " + reduce);
    }

    @DisplayName("List에 존재하는 단어 추출")
    @Test
    public void lambdaPractice2Test() throws Exception {
        List<String> strings = Arrays.asList("lkhajlksdjflka", "kkekjrhekjh", "serf", "DFERWDVDFFDFF");

        List<String> collect = strings.stream().filter(x -> x.length() > 12).sorted().distinct().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}