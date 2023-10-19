package Functional_exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public int id;
    public String name;
    public Address address;
    public List<MobileNumber> mobilenumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(List<MobileNumber> mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public StreamExamples(int id, String name, Address address, List<MobileNumber> mobilenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobilenumber = mobilenumber;
    }

    @Override
    public String toString() {
        return "StreamExamples{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", mobilenumber=" + mobilenumber +
                '}';
    }
}
class Address{
    private String Zipcode;

    public Address(String zipcode) {
        Zipcode = zipcode;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }
}

class MobileNumber{
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MobileNumber(String number) {
        this.number = number;
    }
}

class datas{
    public static void main(String[] args) {
        List<StreamExamples> add= Arrays.asList(
                new StreamExamples(1, "venkatesh", new Address("1233"), List.of(new MobileNumber("1111"),new MobileNumber("4444"))),
                new StreamExamples(2,"Karthick",new  Address("1234"),List.of(new MobileNumber("2222"),new MobileNumber("3333"))),
                new StreamExamples(3,"mani",new  Address("1235"),List.of(new MobileNumber("3333"),new MobileNumber("6666")))
        );


        Optional<StreamExamples> stud = add.stream()
                .filter(studd -> studd.getName().equals("venkatesh")).findFirst();

        System.out.println(stud.isPresent() ? stud.get().getName() : "no student found");
        System.out.println("--------------------");

        Optional<StreamExamples> stud1 = add.stream()
                .filter(studd1 -> studd1.getAddress().getZipcode().equals("1234"))
                .findFirst();
        System.out.println(stud1.isPresent() ? stud1.get().getName() : "No student found");
        System.out.println("--------------------");

        List<StreamExamples> stud2 = add.stream()
                .filter(studd2 -> studd2.getMobilenumber().
                        stream().anyMatch(x-> Objects.equals(x.getNumber(),"3333")))
                .collect(Collectors.toList());

        //System.out.println(stud2);

        String result1 = stud2.stream().map(StreamExamples::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(result1);
        System.out.println("--------------------");


        List<StreamExamples> stud3 = add.stream()
                .filter(studd3 -> studd3.getMobilenumber().
                        stream().allMatch(x -> Objects.equals(x.getNumber(), "1111") || Objects.equals(x.getNumber(), "4444")))
                .collect(Collectors.toList());

        String result4 = stud3.stream().map(StreamExamples::getName).collect(Collectors.joining(",", "[", "]"));
        System.out.println(result4);
        System.out.println("--------------------");

        List<String> nameList =
                Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");

        nameList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("--------------------");

        List<String> namesList =
                Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");

        namesList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("--------------------");

        boolean sortConditionFlag = true;

        Stream<StreamExamples> conditionalFilterResult = add.stream()
                .filter(std -> std.getName().startsWith("m"));

        if(sortConditionFlag){
            conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(StreamExamples::getName));
        }

        System.out.println("Before sorting :");
        add.forEach(s -> System.out.println(s.getName()));

        List<StreamExamples> list = conditionalFilterResult.collect(Collectors.toList());
        System.out.println("After filter and conditional sorting :");
        list.forEach(s -> System.out.println(s.getName()));


    }
}