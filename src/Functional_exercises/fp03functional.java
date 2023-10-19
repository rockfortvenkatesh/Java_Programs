package Functional_exercises;

import java.util.List;

public class fp03functional {
    public static void main(String[] args) {
        List<String> courses = List.of("aws","azure","aws","google","cloud","devops","docker"
        ,"kubernetes","docker");

        courses.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
