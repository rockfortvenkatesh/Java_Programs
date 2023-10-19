package InterviewProblems.java_programs;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class abcs {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(" abc dd", " abcd d", " acc dd", " a c c d d ", "a bcddd");
     //Output: ("abcdd", "accdd", "abcddd")
        List<String> sortedStrings = strings.stream()
                .map(str -> str.replaceAll(" ", ""))
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Sorted Strings:");
        sortedStrings.forEach(System.out::println);
        System.out.println(sortedStrings);
    }
}
