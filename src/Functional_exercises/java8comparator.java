package Functional_exercises;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class java8comparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(2, "John", 25));
        people.add(new Person(1, "Alice", 30));
        people.add(new Person(3, "Bob", 20));

        Comparator<Person> idComparator = Comparator.comparingInt(Person::getId);
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        people.sort(idComparator.thenComparing(nameComparator).thenComparing(ageComparator));

        for (Person person : people) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
