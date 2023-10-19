package Functional_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    private final int id;
    private final String name;
    private final String department;
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
public class studentGetByDept {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", "Physics"),
                new Student(2, "Bob", "Chemistry"),
                new Student(3, "Charlie", "IT"),
                new Student(4, "David", "Physics"),
                new Student(5, "Eve", "IT")
        );

//        Long count = students.stream()
//                .filter(stu -> stu.getDepartment().equals("IT")).count();
//
//        System.out.println(count);

        Map<String, Long> allDepartmentCount = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));


        for(Map.Entry<String,Long> entry:allDepartmentCount.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
