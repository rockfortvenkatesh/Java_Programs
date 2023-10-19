package Functional_exercises;
import java.util.*;

public class oddnumbers {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(12,3,4,54,22,32,13,97);
//        printoddnumbers(numbers);

        List<String> courses = List.of("AWS" , "spring" , "spring boot" , "azure");

        courses.stream()
                //.filter(course -> course.contains("spring"))
                //.filter(course -> course.length() >= 4)
                .map(coursesss -> coursesss + " " + coursesss.length())
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .peek(e -> System.out.println("Debug: " + e))
                .map(num -> num * 2)
                .forEach(System.out::println);

        }
    }

//    private static void printoddnumbers(List<Integer> numbers) {
//
//        numbers.stream()
//                .filter(number->number %2 != 0)
//                .forEach(System.out::println);
//    }

