import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicateJava8 {
    public static void main(String[] args) {
        String s = "venkatesh";


        Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str->str, LinkedHashMap::new,Collectors.counting()));

        System.out.println(map);
    }


}
