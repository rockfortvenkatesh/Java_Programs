package Functional_exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class employeEx {


    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(100,200,300);

         //salary.stream().map(x->x*x).collect(Collectors.toList()).forEach(System.out::println);


        int max= salary.stream().min(Integer::compareTo)
                .orElse(0);

        System.out.println(max);

        List<Integer>  salarymonth = Arrays.asList(204,4332,123);

        int min = salarymonth.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println(min);
    }
}
