package Functional_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Studentmarks {
    private final String name;
    private final Map<String, Integer> subjectMarks;

    public Studentmarks(String name, Map<String, Integer> subjectMarks) {
        this.name = name;
        this.subjectMarks = subjectMarks;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }
}

public class countMarks {
    public static void main(String[] args) {
        // Create a list of students with their subject marks
        List<Studentmarks> students = new ArrayList<>();
        students.add(new Studentmarks("John", Map.of("Tamil", 85, "English", 90, "Maths", 75, "Science", 88)));
        students.add(new Studentmarks("Alice", Map.of("Tamil", 78, "English", 92, "Maths", 80, "Science", 91)));
        students.add(new Studentmarks("Bob", Map.of("Tamil", 92, "English", 87, "Maths", 89, "Science", 94)));

        // Calculate the total marks for each student using Java 8 streams
        students.forEach(student -> {
            int totalMarks = student.getSubjectMarks().values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Student: " + student.getName() + ", Total Marks: " + totalMarks);
        });
    }
}
