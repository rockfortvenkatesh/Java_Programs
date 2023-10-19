package Functional_exercises;
import java.util.*;
public class fp02functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,3,4,2,55,66);

        int result = addfunctional(numbers);
        System.out.println(result);

    }

    private static int addfunctional(List<Integer> numbers) {

       return numbers.stream()
               // .reduce(0,Integer::sum);
               .reduce(0,(x,y)->x+y);
    }

}
