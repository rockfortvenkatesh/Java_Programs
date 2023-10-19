package InterviewProblems.java_programs;

import java.util.Arrays;
import java.util.OptionalDouble;

public class FUnctionalEx {

    public static void main(String[] args) {

        int[] array = {100,24,13,44,114,200,40,112};


        OptionalDouble result =   Arrays.stream(array).map(x -> x*x).filter(x -> x > 10000).average();

        System.out.println(result);
    }

}

