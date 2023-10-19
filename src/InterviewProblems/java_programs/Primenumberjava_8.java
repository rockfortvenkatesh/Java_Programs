package InterviewProblems.java_programs;

import java.util.Arrays;

public class Primenumberjava_8 {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 7, 3, 15, 8, 2 };
        int sumOfPrimes = Arrays.stream(numbers)
                .filter(Primenumberjava_8::isprime)
                .sum();

        Arrays.stream(numbers).filter(Primenumberjava_8::isprime).forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println(sumOfPrimes);
    }

    private static boolean isprime(int number) {
        if(number<=1)
            return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
