package InterviewProblems.java_programs;

import java.util.ArrayList;

class Employee{
    int id;
    int age;
    String Name;
    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        Name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return Name;
    }
}

public class Collectoes {

    public static void main(String[] args) {
        //Employee e = new Employee(1,24,"venkates");
        ArrayList<Employee> e = new ArrayList<>();

        e.add(new Employee(1,34,"venkatesh"));
        e.add(new Employee(2,43,"mani"));
        e.add(new Employee(3,22,"ravi"));



        e.stream()
                .filter(emp -> (emp.getAge() < 30 || emp.getName().equals("venkatesh") ))
                .map(Employee::getName)
                .forEach(System.out::println);



    }
    }


