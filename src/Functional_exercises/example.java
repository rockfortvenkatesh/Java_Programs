package Functional_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class example {
    int id;
    String name;
    String course;


    public example(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

class gett{
    public static void main(String[] args) {
        List<example> add = Arrays.asList(
                new example(1,"venkat","it"),
                new example(2,"ram","ece"),
                new example(3,"mani","ece"),
                new example(4,"vicky","it"),
                new example(5,"ravi","it")
                );

        long count = add.stream().filter(stu-> stu.getCourse().equals("it")).count();

        System.out.println("Specific department count : "+count);

        Map<String, Long> total = add.stream().
                collect(Collectors.groupingBy(example::getCourse,Collectors.counting()));

        for(Map.Entry<String,Long> map : total.entrySet()){
            System.out.println(map.getKey()+" "+ map.getValue());
        }
    }
}

